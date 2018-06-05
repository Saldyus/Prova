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
public class mappali implements Serializable{

    /**
     *
     */
    public mappali() {
    }

    /**
     *
     * @param ID_Mappale
     * @param comune
     * @param sup_catastale
     * @param diossina
     * @param redditoAgrario
     * @param redditoDomenicale
     * @param foglio
     * @param PCB
     * @param metalli
     * @param ragioneSociale
     */
    public mappali(int ID_Mappale, String comune, double sup_catastale, boolean diossina, int redditoAgrario, int redditoDomenicale, int foglio, boolean PCB, boolean metalli, String ragioneSociale) {
        this.ID_Mappale = ID_Mappale;
        this.comune = comune;
        this.sup_catastale = sup_catastale;
        this.diossina = diossina;
        this.redditoAgrario = redditoAgrario;
        this.redditoDomenicale = redditoDomenicale;
        this.foglio = foglio;
        this.PCB = PCB;
        this.metalli = metalli;
        this.ragioneSociale = ragioneSociale;
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
     * @return the comune
     */
    public String getComune() {
        return comune;
    }

    /**
     * @param comune the comune to set
     */
    public void setComune(String comune) {
        this.comune = comune;
    }

    /**
     * @return the sup_catastale
     */
    public double getSup_catastale() {
        return sup_catastale;
    }

    /**
     * @param sup_catastale the sup_catastale to set
     */
    public void setSup_catastale(double sup_catastale) {
        this.sup_catastale = sup_catastale;
    }

    /**
     * @return the diossina
     */
    public boolean isDiossina() {
        return diossina;
    }

    /**
     * @param diossina the diossina to set
     */
    public void setDiossina(boolean diossina) {
        this.diossina = diossina;
    }

    /**
     * @return the redditoAgrario
     */
    public int getRedditoAgrario() {
        return redditoAgrario;
    }

    /**
     * @param redditoAgrario the redditoAgrario to set
     */
    public void setRedditoAgrario(int redditoAgrario) {
        this.redditoAgrario = redditoAgrario;
    }

    /**
     * @return the redditoDomenicale
     */
    public int getRedditoDomenicale() {
        return redditoDomenicale;
    }

    /**
     * @param redditoDomenicale the redditoDomenicale to set
     */
    public void setRedditoDomenicale(int redditoDomenicale) {
        this.redditoDomenicale = redditoDomenicale;
    }

    /**
     * @return the foglio
     */
    public int getFoglio() {
        return foglio;
    }

    /**
     * @param foglio the foglio to set
     */
    public void setFoglio(int foglio) {
        this.foglio = foglio;
    }

    /**
     * @return the PCB
     */
    public boolean isPCB() {
        return PCB;
    }

    /**
     * @param PCB the PCB to set
     */
    public void setPCB(boolean PCB) {
        this.PCB = PCB;
    }

    /**
     * @return the metalli
     */
    public boolean isMetalli() {
        return metalli;
    }

    /**
     * @param metalli the metalli to set
     */
    public void setMetalli(boolean metalli) {
        this.metalli = metalli;
    }

    /**
     * @return the ragioneSociale
     */
    public String getRagioneSociale() {
        return ragioneSociale;
    }

    /**
     * @param ragioneSociale the ragioneSociale to set
     */
    public void setRagioneSociale(String ragioneSociale) {
        this.ragioneSociale = ragioneSociale;
    }
   
    private int ID_Mappale;
    
    @Size(max = 30)
    private String comune;
    
    private double sup_catastale;
    
    private boolean diossina;
    
    private int redditoAgrario;
    
    private int redditoDomenicale;
    
    private int foglio;
    
    private boolean PCB;
    
    private boolean metalli;
    
    @Size(max = 50)
    private String ragioneSociale;
}
