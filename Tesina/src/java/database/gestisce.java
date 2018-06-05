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
public class gestisce implements Serializable {

    /**
     *
     * @param RagioneSociale
     * @param ID_Mappale
     * @param anno
     * @param quota
     */
    public gestisce(String RagioneSociale, int ID_Mappale, int anno, double quota) {
        this.RagioneSociale = RagioneSociale;
        this.ID_Mappale = ID_Mappale;
        this.anno = anno;
        this.quota = quota;
    }

    /**
     *
     */
    public gestisce() {
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

    /**
     * @return the quota
     */
    public double getQuota() {
        return quota;
    }

    /**
     * @param quota the quota to set
     */
    public void setQuota(double quota) {
        this.quota = quota;
    }

    @Size(max = 50)
    private String RagioneSociale;

    private int ID_Mappale;

    private int anno;

    private double quota;
}
