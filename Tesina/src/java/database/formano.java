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
public class formano implements Serializable{

    /**
     *
     */
    public formano() {
    }

    /**
     *
     * @param ID_Mappale
     * @param nome
     */
    public formano(int ID_Mappale, String nome) {
        this.ID_Mappale = ID_Mappale;
        this.nome = nome;
    }
    
    
    
    /**
     * @return the ID_Mappale
     */
    public int getID_Mappale() {
        return ID_Mappale;
    }

    /**
     * @param ID_Mappale the ID_Mappale to set
     */
    public void setID_Mappale(int ID_Mappale) {
        this.ID_Mappale = ID_Mappale;
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
    
    private int ID_Mappale;
    
    @Size(max = 50)
    private String nome;
}
