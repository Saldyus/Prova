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
public class lavorato implements Serializable{

    /**
     *
     * @param nome
     * @param tipo_lavorazione
     * @param data
     */
    public lavorato(String nome, String tipo_lavorazione, Date data) {
        this.nome = nome;
        this.tipo_lavorazione = tipo_lavorazione;
        this.data = data;
    }

    /**
     *
     */
    public lavorato() {
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
    
    @Size(max = 50)
    private String nome;
    
    @Size(max = 40)
    private String tipo_lavorazione;
    
    private Date data;
}
