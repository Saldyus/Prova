/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servletDelete;

import com.google.gson.Gson;
import database.gTerreno;
import database.gestisce;
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
@WebServlet(name = "DeleteAzAgricolaServlet", urlPatterns = {"/DeleteAzAgricolaServlet"})
public class DeleteAzAgricolaServlet extends HttpServlet {

    @Resource(name = "java:app/jdbc/TesinaR")
    private DataSource dataSource;
    
    Gson g;
    
    List<gTerreno> azienda;
    
    List<gestisce> Gestisce;

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
        
        getGTerreno();
        g = new Gson();
        
        String json = "{\"azienda\":" + g.toJson(azienda) +", \"gestisce\":"+ g.toJson(Gestisce) +"}";
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

    private void getGTerreno() {
        azienda = new ArrayList<>();
        Gestisce = new ArrayList<>();
        
        try {
            Connection c = dataSource.getConnection();
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("select gTerreno.*, gestisce.ID_Mappale, gestisce.anno, gestisce.quota from gTerreno, gestisce WHERE gTerreno.RagioneSociale = gestisce.RagioneSociale");
            while(rs.next()){
                String RSociale = rs.getString("RagioneSociale");
                String CTerra = rs.getString("conduzioneterra");
                int ID = rs.getInt("ID_Mappale");
                int anno = rs.getInt("anno");
                int quota = rs.getInt("quota");
                gTerreno GT = new gTerreno(RSociale, CTerra);
                gestisce ge = new gestisce(RSociale, ID, anno, quota);
                azienda.add(GT);
                Gestisce.add(ge);
            }
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(DeleteAzAgricolaServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
