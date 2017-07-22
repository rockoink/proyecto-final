/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rodrigo.fin;

import org.springframework.data.annotation.Id;

/**
 *
 * @author Sony
 */
public class Usuario {
  @Id
    private String rfc;
    private String nombre;
    private String email;
    private Direccion direccion;

    public Usuario(String rfc) {
        this.rfc = rfc;
    }

    public Usuario(String nombre, String email, Direccion direccion) {
        this.nombre = nombre;
        this.email = email;
        this.direccion = direccion;
    }

    public Usuario() {
    }

    public Usuario(String rfc, String nombre, String email, Direccion direccion) {
        this.rfc = rfc;
        this.nombre = nombre;
        this.email = email;
        this.direccion = direccion;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
}
