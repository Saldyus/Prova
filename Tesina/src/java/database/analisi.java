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
public class analisi implements Serializable{

    /**
     *
     */
    public analisi(){
        
    }

    
    
    /**
     *
     * @param ID_Analisi
     * @param allegatoPDF
     * @param argilla
     * @param SO
     * @param limo
     * @param K2O
     * @param CN
     * @param sabbia
     * @param P2o5
     * @param Ntot
     */
    public analisi(int ID_Analisi, String allegatoPDF, int argilla, double SO, int limo, int K2O, int CN, int sabbia, int P2o5, int Ntot) {
        this.ID_Analisi = ID_Analisi;
        this.allegatoPDF = allegatoPDF;
        this.argilla = argilla;
        this.SO = SO;
        this.limo = limo;
        this.K2O = K2O;
        this.CN = CN;
        this.sabbia = sabbia;
        this.P2o5 = P2o5;
        this.Ntot = Ntot;
    }
    
    /**
     * @return the ID_Analisi
     */
    public int getID_Analisi() {
        return ID_Analisi;
    }

    /**
     * @param ID_Analisi the ID_Analisi to set
     */
    public void setID_Analisi(int ID_Analisi) {
        this.ID_Analisi = ID_Analisi;
    }

    /**
     * @return the allegatoPDF
     */
    public String getAllegatoPDF() {
        return allegatoPDF;
    }

    /**
     * @param allegatoPDF the allegatoPDF to set
     */
    public void setAllegatoPDF(String allegatoPDF) {
        this.allegatoPDF = allegatoPDF;
    }

    /**
     * @return the argilla
     */
    public int getArgilla() {
        return argilla;
    }

    /**
     * @param argilla the argilla to set
     */
    public void setArgilla(int argilla) {
        this.argilla = argilla;
    }

    /**
     * @return the SO
     */
    public double getSO() {
        return SO;
    }

    /**
     * @param SO the SO to set
     */
    public void setSO(double SO) {
        this.SO = SO;
    }

    /**
     * @return the limo
     */
    public int getLimo() {
        return limo;
    }

    /**
     * @param limo the limo to set
     */
    public void setLimo(int limo) {
        this.limo = limo;
    }

    /**
     * @return the K2O
     */
    public int getK2O() {
        return K2O;
    }

    /**
     * @param K2O the K2O to set
     */
    public void setK2O(int K2O) {
        this.K2O = K2O;
    }

    /**
     * @return the CN
     */
    public int getCN() {
        return CN;
    }

    /**
     * @param CN the CN to set
     */
    public void setCN(int CN) {
        this.CN = CN;
    }

    /**
     * @return the sabbia
     */
    public int getSabbia() {
        return sabbia;
    }

    /**
     * @param sabbia the sabbia to set
     */
    public void setSabbia(int sabbia) {
        this.sabbia = sabbia;
    }

    /**
     * @return the P2o5
     */
    public int getP2o5() {
        return P2o5;
    }

    /**
     * @param P2o5 the P2o5 to set
     */
    public void setP2o5(int P2o5) {
        this.P2o5 = P2o5;
    }

    /**
     * @return the Ntot
     */
    public int getNtot() {
        return Ntot;
    }

    /**
     * @param Ntot the Ntot to set
     */
    public void setNtot(int Ntot) {
        this.Ntot = Ntot;
    }
    
    private int ID_Analisi;
    
    @Size(max = 30)
    private String allegatoPDF;
    
    private int argilla;
    
    private double SO;
    
    private int limo;
    
    private int K2O;
    
    private int CN;
    
    private int sabbia;
    
    private int P2o5;
    
    private int Ntot;
    
}
