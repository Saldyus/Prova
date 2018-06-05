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
 * @author salva
 */
public class prodotti implements Serializable{

    /**
     *
     * @param nome
     * @param tipo_prodotto
     * @param titoloN
     * @param titoloK
     * @param titoloP
     * @param note
     * @param ID_Descrizione
     */
    public prodotti(String nome, String tipo_prodotto, int titoloN, int titoloK, int titoloP, String note, int ID_Descrizione) {
        this.nome = nome;
        this.tipo_prodotto = tipo_prodotto;
        this.titoloN = titoloN;
        this.titoloK = titoloK;
        this.titoloP = titoloP;
        this.note = note;
        this.ID_Descrizione = ID_Descrizione;
    }

    /**
     *
     */
    public prodotti() {
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
     * @return the tipo_prodotto
     */
    public String getTipo_prodotto() {
        return tipo_prodotto;
    }

    /**
     * @param tipo_prodotto the tipo_prodotto to set
     */
    public void setTipo_prodotto(String tipo_prodotto) {
        this.tipo_prodotto = tipo_prodotto;
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
    
    @Size(max = 50)
    private String nome;
    
    @Size(max = 16)
    private String tipo_prodotto;
    
    private int titoloN;
    
    private int titoloK;
    
    private int titoloP;
    
    private String note;
    
    private int ID_Descrizione;
}