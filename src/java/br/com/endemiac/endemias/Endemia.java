/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.endemiac.endemias;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author endemiac
 */
@Entity
@Table
public class Endemia implements Serializable {
    
    @Id
    @GeneratedValue
    private int idEndemia;
    
    private String nomeComum;
    
    private String nomeCientifico;
    
    private String caracteristicas;
    
    

    public Endemia() {
    }

    public Endemia(String nomeComum, String nomeCientifico, String caracteristicas) {
        this.nomeComum = nomeComum;
        this.nomeCientifico = nomeCientifico;
        this.caracteristicas = caracteristicas;
    }

    /**
     * @return the idEndemia
     */
    public int getIdEndemia() {
        return idEndemia;
    }

    /**
     * @param idEndemia the idEndemia to set
     */
    public void setIdEndemia(int idEndemia) {
        this.idEndemia = idEndemia;
    }

    /**
     * @return the nomeComum
     */
    public String getNomeComum() {
        return nomeComum;
    }

    /**
     * @param nomeComum the nomeComum to set
     */
    public void setNomeComum(String nomeComum) {
        this.nomeComum = nomeComum;
    }

    /**
     * @return the nomeCientifico
     */
    public String getNomeCientifico() {
        return nomeCientifico;
    }

    /**
     * @param nomeCientifico the nomeCientifico to set
     */
    public void setNomeCientifico(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }

    /**
     * @return the caracteristicas
     */
    public String getCaracteristicas() {
        return caracteristicas;
    }

    /**
     * @param caracteristicas the caracteristicas to set
     */
    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
    
}
