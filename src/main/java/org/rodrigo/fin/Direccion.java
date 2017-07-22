/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rodrigo.fin;

/**
 *
 * @author Sony
 */
public class Direccion {
    private String calle;
    private String colonia;
    private Long cp;

    public Direccion(String calle, String colonia, Long cp) {
        this.calle = calle;
        this.colonia = colonia;
        this.cp = cp;
    }

    public Direccion() {
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public Long getCp() {
        return cp;
    }

    public void setCp(Long cp) {
        this.cp = cp;
    }
    
    
}
