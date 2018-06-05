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
public class semina implements Serializable{

    /**
     *
     * @param varieta
     * @param coltura
     * @param maturazione_1
     * @param maturazione_2
     * @param maturazione_3
     * @param p_m2
     * @param note_m
     * @param note_s
     * @param data_fioritura
     */
    public semina(String varieta, String coltura, Date maturazione_1, Date maturazione_2, Date maturazione_3, double p_m2, String note_m, String note_s, Date data_fioritura) {
        this.varieta = varieta;
        this.coltura = coltura;
        this.maturazione_1 = maturazione_1;
        this.maturazione_2 = maturazione_2;
        this.maturazione_3 = maturazione_3;
        this.p_m2 = p_m2;
        this.note_m = note_m;
        this.note_s = note_s;
        this.data_fioritura = data_fioritura;
    }

    /**
     *
     */
    public semina() {
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
     * @return the maturazione_1
     */
    public Date getMaturazione_1() {
        return maturazione_1;
    }

    /**
     * @param maturazione_1 the maturazione_1 to set
     */
    public void setMaturazione_1(Date maturazione_1) {
        this.maturazione_1 = maturazione_1;
    }

    /**
     * @return the maturazione_2
     */
    public Date getMaturazione_2() {
        return maturazione_2;
    }

    /**
     * @param maturazione_2 the maturazione_2 to set
     */
    public void setMaturazione_2(Date maturazione_2) {
        this.maturazione_2 = maturazione_2;
    }

    /**
     * @return the maturazione_3
     */
    public Date getMaturazione_3() {
        return maturazione_3;
    }

    /**
     * @param maturazione_3 the maturazione_3 to set
     */
    public void setMaturazione_3(Date maturazione_3) {
        this.maturazione_3 = maturazione_3;
    }

    /**
     * @return the p_m2
     */
    public double getP_m2() {
        return p_m2;
    }

    /**
     * @param p_m2 the p_m2 to set
     */
    public void setP_m2(double p_m2) {
        this.p_m2 = p_m2;
    }

    /**
     * @return the note_m
     */
    public String getNote_m() {
        return note_m;
    }

    /**
     * @param note_m the note_m to set
     */
    public void setNote_m(String note_m) {
        this.note_m = note_m;
    }

    /**
     * @return the note_s
     */
    public String getNote_s() {
        return note_s;
    }

    /**
     * @param note_s the note_s to set
     */
    public void setNote_s(String note_s) {
        this.note_s = note_s;
    }

    /**
     * @return the data_fioritura
     */
    public Date getData_fioritura() {
        return data_fioritura;
    }

    /**
     * @param data_fioritura the data_fioritura to set
     */
    public void setData_fioritura(Date data_fioritura) {
        this.data_fioritura = data_fioritura;
    }
    
    @Size(max = 20)
    private String varieta;
    
    @Size(max = 20)
    private String coltura;
    
    private Date maturazione_1;
    
    private Date maturazione_2;
    
    private Date maturazione_3;
    
    private double p_m2;
    
    private String note_m;
    
    private String note_s;
    
    private Date data_fioritura;
    
}
