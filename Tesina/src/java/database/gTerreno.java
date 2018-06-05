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
public class gTerreno implements Serializable{

    /**
     *
     */
    public gTerreno() {
    }

    /**
     *
     * @param RagioneSociale
     * @param conduzioneterra
     */
    public gTerreno(String RagioneSociale, String conduzioneterra) {
        this.RagioneSociale = RagioneSociale;
        this.conduzioneterra = conduzioneterra;
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
     * @return the conduzioneterra
     */
    public String getConduzioneterra() {
        return conduzioneterra;
    }

    /**
     * @param conduzioneterra the conduzioneterra to set
     */
    public void setConduzioneterra(String conduzioneterra) {
        this.conduzioneterra = conduzioneterra;
    }
    
    @Size(max = 50)
    private String RagioneSociale;
    
    @Size(max = 20)
    private String conduzioneterra;
}
