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
 * @author Dinaro Salvatore
 */
public class concimazioni implements Serializable{

    /**
     *
     */
    public concimazioni() {
    }

    /**
     *
     * @param ID_Concimazioni
     * @param tipo_concimazione
     * @param qta_usata_ton
     * @param sup_ha
     * @param concime
     * @param data
     * @param note
     * @param nome
     * @param ID_Titolazione
     */
    public concimazioni(int ID_Concimazioni, String tipo_concimazione, int qta_usata_ton, double sup_ha, String concime, Date data, String note, String nome, int ID_Titolazione) {
        this.ID_Concimazioni = ID_Concimazioni;
        this.tipo_concimazione = tipo_concimazione;
        this.qta_usata_ton = qta_usata_ton;
        this.sup_ha = sup_ha;
        this.concime = concime;
        this.data = data;
        this.note = note;
        this.nome = nome;
        this.ID_Titolazione = ID_Titolazione;
    }

    
    
    /**
     * @return the ID_Concimazioni
     */
    public int getID_Concimazioni() {
        return ID_Concimazioni;
    }

    /**
     * @param ID_Concimazioni the ID_Concimazioni to set
     */
    public void setID_Concimazioni(int ID_Concimazioni) {
        this.ID_Concimazioni = ID_Concimazioni;
    }

    /**
     * @return the tipo_concimazione
     */
    public String getTipo_concimazione() {
        return tipo_concimazione;
    }

    /**
     * @param tipo_concimazione the tipo_concimazione to set
     */
    public void setTipo_concimazione(String tipo_concimazione) {
        this.tipo_concimazione = tipo_concimazione;
    }

    /**
     * @return the qta_usata_ton
     */
    public int getQta_usata_ton() {
        return qta_usata_ton;
    }

    /**
     * @param qta_usata_ton the qta_usata_ton to set
     */
    public void setQta_usata_ton(int qta_usata_ton) {
        this.qta_usata_ton = qta_usata_ton;
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
     * @return the concime
     */
    public String getConcime() {
        return concime;
    }

    /**
     * @param concime the concime to set
     */
    public void setConcime(String concime) {
        this.concime = concime;
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
    
    private int ID_Concimazioni;
    
    @Size(max = 8)
    private String tipo_concimazione;
    
    private int qta_usata_ton;
    
    private double sup_ha;
    
    @Size(max = 30)
    private String concime;
    
    private Date data;
    
    private String note;
    
    @Size(max = 50)
    private String nome;
    
    private int ID_Titolazione;
}
