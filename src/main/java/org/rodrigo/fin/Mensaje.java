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

public class Mensaje {
@Id
String id;
String titulo;

    public Mensaje(String id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    public Mensaje(String titulo) {
        this.titulo = titulo;
    }

    public Mensaje() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    
}
