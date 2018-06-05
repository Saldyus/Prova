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
public class analizzato implements Serializable{

    /**
     *
     * @param nome
     * @param ID_Analisi
     * @param data
     */
    public analizzato(String nome, int ID_Analisi, Date data) {
        this.nome = nome;
        this.ID_Analisi = ID_Analisi;
        this.data = data;
    }

    /**
     *
     */
    public analizzato() {
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
     * @return the ID_Analisi
     */
    public int getID_Analisi() {
        return ID_Analisi;
    }

    /**
     * @param ID_Analisi the ID_Analisi to set
     */
    public void setID_Analisi(int ID_Analisi) {
        this.ID_Analisi = ID_Analisi;
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
    
    private int ID_Analisi;
    
    private Date data;
}
