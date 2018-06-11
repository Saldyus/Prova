/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servletDelete;

import com.google.gson.Gson;
import database.possiede;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 *
 * @author salva
 */
@WebServlet(name = "DeleteProprietarioServlet", urlPatterns = {"/DeleteProprietarioServlet"})
public class DeleteProprietarioServlet extends HttpServlet {

    @Resource(name = "java:app/jdbc/TesinaR")
    private DataSource dataSource;
    Gson g;

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<possiede> possiede = getPossiede();
        g = new Gson();
        
        String json = "{\"possiede\":" + g.toJson(possiede)+"}";
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(json);
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String tipo = request.getParameter("tipo");
        
        if(tipo.equals("tutto")){
            String nome = request.getParameter("nome");
            String ID_s = request.getParameter("ID");
            
            int ID = Integer.valueOf(ID_s);
            
            try {
                Connection c = dataSource.getConnection();
                PreparedStatement ps = c.prepareStatement("DELETE FROM possiede WHERE nome = ? AND ID_Mappale = ?");
                ps.setString(1, nome);
                ps.setInt(2, ID);
                ps.executeUpdate();
                c.close();
            } catch (SQLException ex) {
                Logger.getLogger(DeleteProprietarioServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            if(tipo.equals("proprietario")){
                String nome = request.getParameter("nome");
                try {
                    Connection c = dataSource.getConnection();
                    PreparedStatement ps = c.prepareStatement("DELETE FROM proprietari WHERE nome = ?");
                    ps.setString(1, nome);
                    ps.executeUpdate();
                    
                    c.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DeleteProprietarioServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private List<possiede> getPossiede() {
        List<possiede> Possiede = new ArrayList<>();
        
        try {
            Connection c = dataSource.getConnection();
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM possiede");
            while(rs.next()){
                String nome = rs.getString("nome");
                int ID = rs.getInt("ID_Mappale");
                int anno = rs.getInt("anno");
                double quota = rs.getDouble("quota");
                possiede ps = new possiede(nome, ID, anno, quota);
                Possiede.add(ps);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DeleteProprietarioServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Possiede;
    }

}
