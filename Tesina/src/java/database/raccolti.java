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
public class raccolti implements Serializable{

    /**
     *
     * @param ID_Raccolta
     * @param ordine
     * @param coltura
     * @param sup_pio
     * @param gli_verdi
     * @param stoccaggio
     * @param umidita_raccolta
     */
    public raccolti(int ID_Raccolta, String ordine, String coltura, int sup_pio, int gli_verdi, String stoccaggio, int umidita_raccolta) {
        this.ID_Raccolta = ID_Raccolta;
        this.ordine = ordine;
        this.coltura = coltura;
        this.sup_pio = sup_pio;
        this.gli_verdi = gli_verdi;
        this.stoccaggio = stoccaggio;
        this.umidita_raccolta = umidita_raccolta;
    }

    /**
     *
     */
    public raccolti() {
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
     * @return the ordine
     */
    public String getOrdine() {
        return ordine;
    }

    /**
     * @param ordine the ordine to set
     */
    public void setOrdine(String ordine) {
        this.ordine = ordine;
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
     * @return the sup_pio
     */
    public int getSup_pio() {
        return sup_pio;
    }

    /**
     * @param sup_pio the sup_pio to set
     */
    public void setSup_pio(int sup_pio) {
        this.sup_pio = sup_pio;
    }

    /**
     * @return the gli_verdi
     */
    public int getGli_verdi() {
        return gli_verdi;
    }

    /**
     * @param gli_verdi the gli_verdi to set
     */
    public void setGli_verdi(int gli_verdi) {
        this.gli_verdi = gli_verdi;
    }

    /**
     * @return the stoccaggio
     */
    public String getStoccaggio() {
        return stoccaggio;
    }

    /**
     * @param stoccaggio the stoccaggio to set
     */
    public void setStoccaggio(String stoccaggio) {
        this.stoccaggio = stoccaggio;
    }

    /**
     * @return the umidita_raccolta
     */
    public int getUmidita_raccolta() {
        return umidita_raccolta;
    }

    /**
     * @param umidita_raccolta the umidita_raccolta to set
     */
    public void setUmidita_raccolta(int umidita_raccolta) {
        this.umidita_raccolta = umidita_raccolta;
    }
    
    private int ID_Raccolta;
    
    @Size(max = 40)
    private String ordine;
    
    @Size(max = 20)
    private String coltura;
    
    private int sup_pio;
    
    private int gli_verdi;
    
    @Size(max = 20)
    private String stoccaggio;
    
    private int umidita_raccolta;
}
