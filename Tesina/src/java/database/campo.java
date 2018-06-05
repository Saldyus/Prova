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
public class campo implements Serializable{

    /**
     *
     * @param nome
     * @param zona
     * @param UPA
     * @param superficie
     */
    public campo(String nome, String zona, int UPA, double superficie) {
        this.nome = nome;
        this.zona = zona;
        this.UPA = UPA;
        this.superficie = superficie;
    }

    /**
     *
     */
    public campo() {
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
     * @return the zona
     */
    public String getZona() {
        return zona;
    }

    /**
     * @param zona the zona to set
     */
    public void setZona(String zona) {
        this.zona = zona;
    }

    /**
     * @return the UPA
     */
    public int getUPA() {
        return UPA;
    }

    /**
     * @param UPA the UPA to set
     */
    public void setUPA(int UPA) {
        this.UPA = UPA;
    }

    /**
     * @return the superficie
     */
    public double getSuperficie() {
        return superficie;
    }

    /**
     * @param superficie the superficie to set
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }
    
    @Size(max = 50)
    private String nome;
    
    @Size(max = 20)
    private String zona;
    
    private int UPA;
    
    private double superficie;
}
