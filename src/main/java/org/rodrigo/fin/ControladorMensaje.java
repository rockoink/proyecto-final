/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rodrigo.fin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Sony
 */
@RestController
@CrossOrigin  //permite que otros servidores accedan a los servicios 
public class ControladorMensaje {
    @Autowired RepositorioMensaje repoMensaje;
    
    @RequestMapping(value="/guardar-mensaje",method=RequestMethod.GET,
                    headers={"Accept= text/html"})

    public String guardarMensaje(){
repoMensaje.save(new Mensaje("mi primer registro en Mongo"));
return "Mensaje guardado";
}
    
    
}
