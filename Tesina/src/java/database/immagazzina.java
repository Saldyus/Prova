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
public class immagazzina implements Serializable{

    /**
     *
     * @param RagioneSociale
     * @param nome
     * @param DDT
     * @param data_acquisto
     * @param l_Kg_acquistati
     */
    public immagazzina(String RagioneSociale, String nome, int DDT, Date data_acquisto, int l_Kg_acquistati) {
        this.RagioneSociale = RagioneSociale;
        this.nome = nome;
        this.DDT = DDT;
        this.data_acquisto = data_acquisto;
        this.l_Kg_acquistati = l_Kg_acquistati;
    }

    /**
     *
     */
    public immagazzina() {
    }

    /**
     * @return the RagioneSociale
     */
    public String getRagioneSociale() {
        return RagioneSociale;
    }

    /**
     * @param RagioneSociale the RagioneSociale to set
     */
    public void setRagioneSociale(String RagioneSociale) {
        this.RagioneSociale = RagioneSociale;
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
     * @return the DDT
     */
    public int getDDT() {
        return DDT;
    }

    /**
     * @param DDT the DDT to set
     */
    public void setDDT(int DDT) {
        this.DDT = DDT;
    }

    /**
     * @return the data_acquisto
     */
    public Date getData_acquisto() {
        return data_acquisto;
    }

    /**
     * @param data_acquisto the data_acquisto to set
     */
    public void setData_acquisto(Date data_acquisto) {
        this.data_acquisto = data_acquisto;
    }

    /**
     * @return the l_Kg_acquistati
     */
    public int getL_Kg_acquistati() {
        return l_Kg_acquistati;
    }

    /**
     * @param l_Kg_acquistati the l_Kg_acquistati to set
     */
    public void setL_Kg_acquistati(int l_Kg_acquistati) {
        this.l_Kg_acquistati = l_Kg_acquistati;
    }
    
    @Size(max = 50)
    private String RagioneSociale;
    
    @Size(max = 50)
    private String nome;
    
    private int DDT;
    
    private Date data_acquisto;
    
    private int l_Kg_acquistati;
}
