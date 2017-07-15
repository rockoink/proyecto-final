/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rodrigo.fin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Sony
 */
@RestController
@CrossOrigin  

//@Path("/mensaje/")


//permite que otros servidores accedan a los servicios 
public class ControladorMensaje {
    @Autowired RepositorioMensaje repoMensaje;
    
    @RequestMapping(value="/guardar-mensaje",method=RequestMethod.GET,
                    headers={"Accept= text/html"})

    public String guardarMensaje(){
repoMensaje.save(new Mensaje("mi primer registro en Mongo"));
return "Mensaje guardado por fin";
}
    
    //desarrollar un controlador con las cinco operaciones basicas en el controlador mensaje
    //nota: como valores de entrada y salida utilizar solamente objetos json y arreglos json
    
    //caso post
    @RequestMapping(value="/mensaje", method=RequestMethod.POST,
            headers={"application/json"})
    
    public Estatus guardar(@RequestBody String json){
         System.out.println(json);
        
         Estatus e=new Estatus();
         e.setSuccess(true);
         return e;
    }
    
    
    
    
    
}
