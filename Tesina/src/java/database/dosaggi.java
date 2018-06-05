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
public class dosaggi implements Serializable{

    /**
     *
     */
    public dosaggi() {
    }

    /**
     *
     * @param ID_Dosaggio
     * @param coltura
     * @param dosaggio
     * @param nome
     */
    public dosaggi(int ID_Dosaggio, String coltura, double dosaggio, String nome) {
        this.ID_Dosaggio = ID_Dosaggio;
        this.coltura = coltura;
        this.dosaggio = dosaggio;
        this.nome = nome;
    }
    
    
    
    /**
     * @return the ID_Dosaggio
     */
    public int getID_Dosaggio() {
        return ID_Dosaggio;
    }

    /**
     * @param ID_Dosaggio the ID_Dosaggio to set
     */
    public void setID_Dosaggio(int ID_Dosaggio) {
        this.ID_Dosaggio = ID_Dosaggio;
    }

    /**
     * @return the coltura
     */
    public String getColtura() {
        return coltura;
    }

    /**
     * @param coltura the coltura to set
     */
    public void setColtura(String coltura) {
        this.coltura = coltura;
    }

    /**
     * @return the dosaggio
     */
    public double getDosaggio() {
        return dosaggio;
    }

    /**
     * @param dosaggio the dosaggio to set
     */
    public void setDosaggio(double dosaggio) {
        this.dosaggio = dosaggio;
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
    
    private int ID_Dosaggio;
    
    @Size(max = 20)
    private String coltura;
    
    private double dosaggio;
    
    @Size(max = 50)
    private String nome; 
    
}
