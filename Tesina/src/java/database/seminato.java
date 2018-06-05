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
public class seminato implements Serializable{
    
    @Size(max = 50)
    private String nome;
    
    @Size(max = 20)
    private String varieta;
    
    @Size(max = 20)
    private String coltura;
    
    private Date data;

    /**
     *
     * @param nome
     * @param varieta
     * @param coltura
     * @param data
     */
    public seminato(String nome, String varieta, String coltura, Date data) {
        this.nome = nome;
        this.varieta = varieta;
        this.coltura = coltura;
        this.data = data;
    }

    /**
     *
     */
    public seminato() {
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
     * @return the varieta
     */
    public String getVarieta() {
        return varieta;
    }

    /**
     * @param varieta the varieta to set
     */
    public void setVarieta(String varieta) {
        this.varieta = varieta;
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
}
