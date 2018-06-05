/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.io.Serializable;
import java.sql.Date;
import javax.validation.constraints.Size;

/**
 *
 * @author salva
 */
public class titOrganica implements Serializable{
    
    private int ID_Titolazione;
    
    private int titoloN;
    
    private int titoloP;
    
    private int titoloK;
    
    private Date date;
    
    @Size(max = 30)
    private String pdf_analisi;

    /**
     *
     * @param ID_Titolazione
     * @param titoloN
     * @param titoloP
     * @param titoloK
     * @param date
     * @param pdf_analisi
     */
    public titOrganica(int ID_Titolazione, int titoloN, int titoloP, int titoloK, Date date, String pdf_analisi) {
        this.ID_Titolazione = ID_Titolazione;
        this.titoloN = titoloN;
        this.titoloP = titoloP;
        this.titoloK = titoloK;
        this.date = date;
        this.pdf_analisi = pdf_analisi;
    }

    /**
     *
     */
    public titOrganica() {
    }

    /**
     * @return the ID_Titolazione
     */
    public int getID_Titolazione() {
        return ID_Titolazione;
    }

    /**
     * @param ID_Titolazione the ID_Titolazione to set
     */
    public void setID_Titolazione(int ID_Titolazione) {
        this.ID_Titolazione = ID_Titolazione;
    }

    /**
     * @return the titoloN
     */
    public int getTitoloN() {
        return titoloN;
    }

    /**
     * @param titoloN the titoloN to set
     */
    public void setTitoloN(int titoloN) {
        this.titoloN = titoloN;
    }

    /**
     * @return the titoloP
     */
    public int getTitoloP() {
        return titoloP;
    }

    /**
     * @param titoloP the titoloP to set
     */
    public void setTitoloP(int titoloP) {
        this.titoloP = titoloP;
    }

    /**
     * @return the titoloK
     */
    public int getTitoloK() {
        return titoloK;
    }

    /**
     * @param titoloK the titoloK to set
     */
    public void setTitoloK(int titoloK) {
        this.titoloK = titoloK;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the pdf_analisi
     */
    public String getPdf_analisi() {
        return pdf_analisi;
    }

    /**
     * @param pdf_analisi the pdf_analisi to set
     */
    public void setPdf_analisi(String pdf_analisi) {
        this.pdf_analisi = pdf_analisi;
    }
}
