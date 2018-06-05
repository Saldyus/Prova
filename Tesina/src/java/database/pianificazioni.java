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
public class pianificazioni implements Serializable{

    /**
     *
     * @param ID_Pianificazione
     * @param rotazione_1
     * @param sup_rot_1
     * @param rotazione_2
     * @param sup_rot_2
     * @param rotazione_3
     * @param sup_rot_3
     */
    public pianificazioni(int ID_Pianificazione, String rotazione_1, double sup_rot_1, String rotazione_2, double sup_rot_2, String rotazione_3, double sup_rot_3) {
        this.ID_Pianificazione = ID_Pianificazione;
        this.rotazione_1 = rotazione_1;
        this.sup_rot_1 = sup_rot_1;
        this.rotazione_2 = rotazione_2;
        this.sup_rot_2 = sup_rot_2;
        this.rotazione_3 = rotazione_3;
        this.sup_rot_3 = sup_rot_3;
    }

    /**
     *
     */
    public pianificazioni() {
    }

    /**
     * @return the ID_Pianificazione
     */
    public int getID_Pianificazione() {
        return ID_Pianificazione;
    }

    /**
     * @param ID_Pianificazione the ID_Pianificazione to set
     */
    public void setID_Pianificazione(int ID_Pianificazione) {
        this.ID_Pianificazione = ID_Pianificazione;
    }

    /**
     * @return the rotazione_1
     */
    public String getRotazione_1() {
        return rotazione_1;
    }

    /**
     * @param rotazione_1 the rotazione_1 to set
     */
    public void setRotazione_1(String rotazione_1) {
        this.rotazione_1 = rotazione_1;
    }

    /**
     * @return the sup_rot_1
     */
    public double getSup_rot_1() {
        return sup_rot_1;
    }

    /**
     * @param sup_rot_1 the sup_rot_1 to set
     */
    public void setSup_rot_1(double sup_rot_1) {
        this.sup_rot_1 = sup_rot_1;
    }

    /**
     * @return the rotazione_2
     */
    public String getRotazione_2() {
        return rotazione_2;
    }

    /**
     * @param rotazione_2 the rotazione_2 to set
     */
    public void setRotazione_2(String rotazione_2) {
        this.rotazione_2 = rotazione_2;
    }

    /**
     * @return the sup_rot_2
     */
    public double getSup_rot_2() {
        return sup_rot_2;
    }

    /**
     * @param sup_rot_2 the sup_rot_2 to set
     */
    public void setSup_rot_2(double sup_rot_2) {
        this.sup_rot_2 = sup_rot_2;
    }

    /**
     * @return the rotazione_3
     */
    public String getRotazione_3() {
        return rotazione_3;
    }

    /**
     * @param rotazione_3 the rotazione_3 to set
     */
    public void setRotazione_3(String rotazione_3) {
        this.rotazione_3 = rotazione_3;
    }

    /**
     * @return the sup_rot_3
     */
    public double getSup_rot_3() {
        return sup_rot_3;
    }

    /**
     * @param sup_rot_3 the sup_rot_3 to set
     */
    public void setSup_rot_3(double sup_rot_3) {
        this.sup_rot_3 = sup_rot_3;
    }
    
    private int ID_Pianificazione;
    
    @Size(max = 30)
    private String rotazione_1;
    
    private double sup_rot_1;
    
    @Size(max = 30)
    private String rotazione_2;
    
    private double sup_rot_2;
    
    @Size(max = 30)
    private String rotazione_3;
    
    private double sup_rot_3;
    
}
