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
public class trFitofarmaci implements Serializable{
    
    private int ID_Fitofarmaco;
    
    @Size(max = 20)
    private String fitofarmaco;
    
    private double sup_ha;
    
    private int qta_usata_lKg;
    
    @Size(max = 30)
    private String avversita;
    
    @Size(max = 40)
    private String firma;
    
    @Size(max = 40)
    private String nome_operatore;
    
    private Date data;
    
    private String note;
    
    @Size(max = 50)
    private String nome;

    /**
     *
     * @param ID_Fitofarmaco
     * @param fitofarmaco
     * @param sup_ha
     * @param qta_usata_lKg
     * @param avversita
     * @param firma
     * @param nome_operatore
     * @param data
     * @param note
     * @param nome
     */
    public trFitofarmaci(int ID_Fitofarmaco, String fitofarmaco, double sup_ha, int qta_usata_lKg, String avversita, String firma, String nome_operatore, Date data, String note, String nome) {
        this.ID_Fitofarmaco = ID_Fitofarmaco;
        this.fitofarmaco = fitofarmaco;
        this.sup_ha = sup_ha;
        this.qta_usata_lKg = qta_usata_lKg;
        this.avversita = avversita;
        this.firma = firma;
        this.nome_operatore = nome_operatore;
        this.data = data;
        this.note = note;
        this.nome = nome;
    }

    /**
     *
     */
    public trFitofarmaci() {
    }

    /**
     * @return the ID_Fitofarmaco
     */
    public int getID_Fitofarmaco() {
        return ID_Fitofarmaco;
    }

    /**
     * @param ID_Fitofarmaco the ID_Fitofarmaco to set
     */
    public void setID_Fitofarmaco(int ID_Fitofarmaco) {
        this.ID_Fitofarmaco = ID_Fitofarmaco;
    }

    /**
     * @return the fitofarmaco
     */
    public String getFitofarmaco() {
        return fitofarmaco;
    }

    /**
     * @param fitofarmaco the fitofarmaco to set
     */
    public void setFitofarmaco(String fitofarmaco) {
        this.fitofarmaco = fitofarmaco;
    }

    /**
     * @return the sup_ha
     */
    public double getSup_ha() {
        return sup_ha;
    }

    /**
     * @param sup_ha the sup_ha to set
     */
    public void setSup_ha(double sup_ha) {
        this.sup_ha = sup_ha;
    }

    /**
     * @return the qta_usata_lKg
     */
    public int getQta_usata_lKg() {
        return qta_usata_lKg;
    }

    /**
     * @param qta_usata_lKg the qta_usata_lKg to set
     */
    public void setQta_usata_lKg(int qta_usata_lKg) {
        this.qta_usata_lKg = qta_usata_lKg;
    }

    /**
     * @return the avversita
     */
    public String getAvversita() {
        return avversita;
    }

    /**
     * @param avversita the avversita to set
     */
    public void setAvversita(String avversita) {
        this.avversita = avversita;
    }

    /**
     * @return the firma
     */
    public String getFirma() {
        return firma;
    }

    /**
     * @param firma the firma to set
     */
    public void setFirma(String firma) {
        this.firma = firma;
    }

    /**
     * @return the nome_operatore
     */
    public String getNome_operatore() {
        return nome_operatore;
    }

    /**
     * @param nome_operatore the nome_operatore to set
     */
    public void setNome_operatore(String nome_operatore) {
        this.nome_operatore = nome_operatore;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return the note
     */
    public String getNote() {
        return note;
    }

    /**
     * @param note the note to set
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
}
