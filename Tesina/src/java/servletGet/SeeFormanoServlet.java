/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servletGet;

import com.google.gson.Gson;
import database.formano;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
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
@WebServlet(name = "seeMappaliServlet", urlPatterns = {"/SeeFormanoServlet"})
public class SeeFormanoServlet extends HttpServlet {

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
        
        System.out.println("prova");
        
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
        
        String nome = request.getParameter("nome");
        
        List<formano> forma = getFormano(nome);
        
        request.setAttribute("formano", forma);
        request.getRequestDispatcher("visualizza/formano.jsp").forward(request, response);
        
    }

    private List<formano> getFormano(String nome_s){
        List<formano> forma = new ArrayList<>();
        
        nome_s = "\""+nome_s+"\"";
        
        try {
            Connection c = dataSource.getConnection();
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM formano WHERE nome="+nome_s);
            while(rs.next()){
                int ID = rs.getInt("ID_Mappale");
                String nome = rs.getString("nome");
                formano fm = new formano(ID, nome);
                forma.add(fm);
            }
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(SeeFormanoServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        return forma;
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
