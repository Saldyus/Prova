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
public class gLiquami implements Serializable{

    /**
     *
     */
    public gLiquami() {
    }

    /**
     *
     * @param RagioneSociale
     * @param ConduzioneLiquame
     */
    public gLiquami(String RagioneSociale, String ConduzioneLiquame) {
        this.RagioneSociale = RagioneSociale;
        this.ConduzioneLiquame = ConduzioneLiquame;
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
     * @return the ConduzioneLiquame
     */
    public String getConduzioneLiquame() {
        return ConduzioneLiquame;
    }

    /**
     * @param ConduzioneLiquame the ConduzioneLiquame to set
     */
    public void setConduzioneLiquame(String ConduzioneLiquame) {
        this.ConduzioneLiquame = ConduzioneLiquame;
    }
    
    @Size(max = 50)
    private String RagioneSociale;
    
    @Size(max = 20)
    private String ConduzioneLiquame;
}
