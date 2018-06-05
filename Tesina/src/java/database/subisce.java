/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.io.Serializable;

/**
 *
 * @author salva
 */
public class subisce implements Serializable{
    
    private int ID_Mappale;
    
    private int ID_pianificazione;
    
    private int anno;

    /**
     *
     * @param ID_Mappale
     * @param ID_pianificazione
     * @param anno
     */
    public subisce(int ID_Mappale, int ID_pianificazione, int anno) {
        this.ID_Mappale = ID_Mappale;
        this.ID_pianificazione = ID_pianificazione;
        this.anno = anno;
    }

    /**
     *
     */
    public subisce() {
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
     * @return the ID_pianificazione
     */
    public int getID_pianificazione() {
        return ID_pianificazione;
    }

    /**
     * @param ID_pianificazione the ID_pianificazione to set
     */
    public void setID_pianificazione(int ID_pianificazione) {
        this.ID_pianificazione = ID_pianificazione;
    }

    /**
     * @return the anno
     */
    public int getAnno() {
        return anno;
    }

    /**
     * @param anno the anno to set
     */
    public void setAnno(int anno) {
        this.anno = anno;
    }
}
