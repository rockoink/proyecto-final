/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rodrigo.fin;

import java.util.Date;
import org.springframework.data.annotation.Id;

/**
 *
 * @author Sony
 */
public class UsuarioHospital {
   @Id
    String id;
   String login;
   String password;
   String nombre;
   String paterno;
   String edad;
   Date fechaIngerso;
   String puesto;

    public UsuarioHospital(String id) {
        this.id = id;
    }

    public UsuarioHospital(String login, String password, String nombre, String paterno, String edad, Date fechaIngerso, String puesto) {
        this.login = login;
        this.password = password;
        this.nombre = nombre;
        this.paterno = paterno;
        this.edad = edad;
        this.fechaIngerso = fechaIngerso;
        this.puesto = puesto;
    }

    public UsuarioHospital() {
    }

    public UsuarioHospital(String id, String login, String password, String nombre, String paterno, String edad, Date fechaIngerso, String puesto) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.nombre = nombre;
        this.paterno = paterno;
        this.edad = edad;
        this.fechaIngerso = fechaIngerso;
        this.puesto = puesto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public Date getFechaIngerso() {
        return fechaIngerso;
    }

    public void setFechaIngerso(Date fechaIngerso) {
        this.fechaIngerso = fechaIngerso;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
}
