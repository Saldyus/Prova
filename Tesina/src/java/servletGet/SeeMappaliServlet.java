/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servletGet;

import com.google.gson.Gson;
import database.mappali;
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
@WebServlet(name = "SeeMappaliServlet", urlPatterns = {"/SeeMappaliServlet"})
public class SeeMappaliServlet extends HttpServlet {

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
        
        String ID = request.getParameter("mappale");
        
        System.out.println("ID: "+ID);
        
        List<mappali> map = getMappali(ID);
        
        request.setAttribute("mappali", map);
        request.getRequestDispatcher("visualizza/mappali.jsp").forward(request, response);
        
    }

    private List<mappali> getMappali(String ID_s){
        List<mappali> mappale = new ArrayList<>();
        
        try {
            Connection c = dataSource.getConnection();
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM mappali WHERE ID_Mappale="+ID_s);
            while(rs.next()){
                int ID = rs.getInt("ID_Mappale");
                String comune = rs.getString("comune");
                double superficie = rs.getDouble("sup_catastale");
                boolean diossina = rs.getBoolean("diossina");
                int redditoA = rs.getInt("redditoAgrario");
                int redditoD = rs.getInt("redditoDomenicale");
                int foglio = rs.getInt("foglio");
                boolean PCB = rs.getBoolean("PCB");
                boolean metalli = rs.getBoolean("metalli");
                String RagioneSociale = rs.getString("RagioneSociale");
                mappali mp = new mappali(ID, comune, superficie, diossina, redditoA, redditoD, foglio, PCB, metalli, RagioneSociale);
                mappale.add(mp);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(SeeMappaliServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mappale;
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

}
