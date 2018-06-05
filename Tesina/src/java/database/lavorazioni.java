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
public class lavorazioni implements Serializable{

    /**
     *
     * @param tipo_lavorazione
     * @param attrezzatura
     * @param note
     */
    public lavorazioni(String tipo_lavorazione, String attrezzatura, String note) {
        this.tipo_lavorazione = tipo_lavorazione;
        this.attrezzatura = attrezzatura;
        this.note = note;
    }

    /**
     *
     */
    public lavorazioni() {
    }

    /**
     * @return the tipo_lavorazione
     */
    public String getTipo_lavorazione() {
        return tipo_lavorazione;
    }

    /**
     * @param tipo_lavorazione the tipo_lavorazione to set
     */
    public void setTipo_lavorazione(String tipo_lavorazione) {
        this.tipo_lavorazione = tipo_lavorazione;
    }

    /**
     * @return the attrezzatura
     */
    public String getAttrezzatura() {
        return attrezzatura;
    }

    /**
     * @param attrezzatura the attrezzatura to set
     */
    public void setAttrezzatura(String attrezzatura) {
        this.attrezzatura = attrezzatura;
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
    
    @Size(max = 40)
    private String tipo_lavorazione;
    
    @Size(max = 20)
    private String attrezzatura;
    
    private String note;
}
