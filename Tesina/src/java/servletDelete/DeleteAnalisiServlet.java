/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servletDelete;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import database.analisi;
import database.analizzato;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 *
 * @author salva
 */
@WebServlet(name = "DeleteAnalisiServlet", urlPatterns = {"/DeleteAnalisiServlet"})
public class DeleteAnalisiServlet extends HttpServlet {

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
        List<analisi> analisi = getAnalisi();
        List<analizzato> analizzato = getAnalizzato();
        g = new Gson();

        String json = "{\"analisi\":" + g.toJson(analisi) + ", \"analizzato\":"+ g.toJson(analizzato) +"}";
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(json);
    }

    private List<analizzato> getAnalizzato() {
        List<analizzato> Analizzato = new ArrayList<>();
        try {
            Connection c = dataSource.getConnection();
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM analizzato ORDER BY ID_Analisi");
            while(rs.next()){
                String campo = rs.getString("nome");
                int ID = rs.getInt("ID_Analisi");
                Date data = rs.getDate("data");
                analizzato an = new analizzato(campo, ID, data);
                Analizzato.add(an);
            }
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(DeleteAnalisiServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return Analizzato;
    }

    private List<analisi> getAnalisi() {
        List<analisi> Analisi = new ArrayList<>();

        try {
            Connection c = dataSource.getConnection();
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM analisi ORDER BY ID_Analisi");
            while (rs.next()) {
                int ID = rs.getInt("ID_Analisi");
                String PDF = rs.getString("allegatooPDF");
                int argilla = rs.getInt("argilla");
                double SO = rs.getDouble("SO");
                int limo = rs.getInt("limo");
                int K2O = rs.getInt("K2O");
                int CN = rs.getInt("CN");
                int sabbia = rs.getInt("sabbia");
                int P2o5 = rs.getInt("P2o5");
                int Ntot = rs.getInt("Ntot");
                analisi an = new analisi(ID, PDF, argilla, SO, limo, K2O, CN, sabbia, P2o5, Ntot);
                Analisi.add(an);
            }
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(DeleteAnalisiServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

        return Analisi;
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

}
