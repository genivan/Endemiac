/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.endemiac.endemias;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author endemiac
 */
@ManagedBean(name = "endemias")
public class EndemiaBean {
    
    Endemia endemia;
    
    public EndemiaBean() {
        endemia = new Endemia();
    }
    
    public Endemia getEndemia() {
        return endemia;
    }
    
    public void setEndemia(Endemia endemia) {
        this.endemia = endemia;
    }
    
}
