package database;

import java.io.Serializable;
import javax.validation.constraints.Size;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dinaro Salvatore
 */
public class proprietari implements Serializable{
    
    @Size(max = 50)
    private String nome;
    
    /**
     * 
     * @param nome Il nome del proprietario
     */
    public proprietari(String nome){
        this.nome = nome;
    }

    /**
     *
     */
    public proprietari() {
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
