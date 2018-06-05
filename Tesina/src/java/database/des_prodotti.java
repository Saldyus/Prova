/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.io.Serializable;
import javax.validation.constraints.Size;

/**
 *
 * @author Dinaro Salvatore
 */
public class des_prodotti implements Serializable{
    
    private int ID_Descrizione;
    
    @Size(max = 30)
    private String pdf_etichetta;
    
    @Size(max = 30)
    private String pdf_sicurezza;
    
    @Size(max = 20)
    private String PA1;
    
    private int PA1_p;
    
    @Size(max = 20)
    private String PA2;
    
    private int PA2_p;

    /**
     *
     */
    public des_prodotti() {
    }

    /**
     *
     * @param ID_Descrizione
     * @param pdf_etichetta
     * @param pdf_sicurezza
     * @param PA1
     * @param PA1_p
     * @param PA2
     * @param PA2_p
     */
    public des_prodotti(int ID_Descrizione, String pdf_etichetta, String pdf_sicurezza, String PA1, int PA1_p, String PA2, int PA2_p) {
        this.ID_Descrizione = ID_Descrizione;
        this.pdf_etichetta = pdf_etichetta;
        this.pdf_sicurezza = pdf_sicurezza;
        this.PA1 = PA1;
        this.PA1_p = PA1_p;
        this.PA2 = PA2;
        this.PA2_p = PA2_p;
    }

    
    
    /**
     * @return the ID_Descrizione
     */
    public int getID_Descrizione() {
        return ID_Descrizione;
    }

    /**
     * @param ID_Descrizione the ID_Descrizione to set
     */
    public void setID_Descrizione(int ID_Descrizione) {
        this.ID_Descrizione = ID_Descrizione;
    }

    /**
     * @return the pdf_etichetta
     */
    public String getPdf_etichetta() {
        return pdf_etichetta;
    }

    /**
     * @param pdf_etichetta the pdf_etichetta to set
     */
    public void setPdf_etichetta(String pdf_etichetta) {
        this.pdf_etichetta = pdf_etichetta;
    }

    /**
     * @return the pdf_sicurezza
     */
    public String getPdf_sicurezza() {
        return pdf_sicurezza;
    }

    /**
     * @param pdf_sicurezza the pdf_sicurezza to set
     */
    public void setPdf_sicurezza(String pdf_sicurezza) {
        this.pdf_sicurezza = pdf_sicurezza;
    }

    /**
     * @return the PA1
     */
    public String getPA1() {
        return PA1;
    }

    /**
     * @param PA1 the PA1 to set
     */
    public void setPA1(String PA1) {
        this.PA1 = PA1;
    }

    /**
     * @return the PA1_p
     */
    public int getPA1_p() {
        return PA1_p;
    }

    /**
     * @param PA1_p the PA1_p to set
     */
    public void setPA1_p(int PA1_p) {
        this.PA1_p = PA1_p;
    }

    /**
     * @return the PA2
     */
    public String getPA2() {
        return PA2;
    }

    /**
     * @param PA2 the PA2 to set
     */
    public void setPA2(String PA2) {
        this.PA2 = PA2;
    }

    /**
     * @return the PA2_p
     */
    public int getPA2_p() {
        return PA2_p;
    }

    /**
     * @param PA2_p the PA2_p to set
     */
    public void setPA2_p(int PA2_p) {
        this.PA2_p = PA2_p;
    }
}
