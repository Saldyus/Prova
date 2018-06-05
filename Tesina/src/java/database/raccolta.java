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
public class raccolta implements Serializable{

    /**
     *
     * @param nome
     * @param ID_Raccolta
     * @param data
     */
    public raccolta(String nome, int ID_Raccolta, Date data) {
        this.nome = nome;
        this.ID_Raccolta = ID_Raccolta;
        this.data = data;
    }

    /**
     *
     */
    public raccolta() {
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
     * @return the ID_Raccolta
     */
    public int getID_Raccolta() {
        return ID_Raccolta;
    }

    /**
     * @param ID_Raccolta the ID_Raccolta to set
     */
    public void setID_Raccolta(int ID_Raccolta) {
        this.ID_Raccolta = ID_Raccolta;
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
    
    private int ID_Raccolta;
    
    private Date data;
}
