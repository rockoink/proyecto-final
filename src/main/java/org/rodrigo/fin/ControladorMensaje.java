/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rodrigo.fin;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
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
   
    /* forma anterior
    @RequestMapping(value="/guardar-mensaje",method=RequestMethod.GET,
                    headers={"Accept= text/html"})

    public String guardarMensaje(){
repoMensaje.save(new Mensaje("mi primer registro en Mongo"));
return "Mensaje guardado por fin";
}*/
    
    //desarrollar un controlador con las cinco operaciones basicas en el controlador mensaje
    //nota: como valores de entrada y salida utilizar solamente objetos json y arreglos json
    
    //caso post
    @RequestMapping(value="/mensaje", method=RequestMethod.POST,
            headers={"application/json"})
    
    public Estatus guardar(@RequestBody String json) throws Exception{
         System.out.println(json);
        ObjectMapper maper=new ObjectMapper();
        Mensaje mensa=maper.readValue(json,Mensaje.class);
        repoMensaje.save(mensa);
         Estatus e=new Estatus();
         e.setSuccess(true);
         return e;
    }
    //caso delete  --prueba
    @RequestMapping(value="/mensaje/{id}", method=RequestMethod.DELETE, headers={"Accept=application/json"})
    public Estatus borrar(@PathVariable String id) throws Exception{
        System.out.println("llego con un id "+ id);
        Estatus e =new Estatus();
       repoMensaje.delete(id);
       if(repoMensaje.findOne(id)==null) e.setSuccess(true);
        else e.setSuccess(false);
       
        return e;
    }
    
    
    //caso buscar todos
     @RequestMapping(value="/mensaje", method = RequestMethod.GET, headers = {"Accept=application/json"})
    public ArrayList<Mensaje> getTodos(){
         
        return (ArrayList<Mensaje>) repoMensaje.findAll();
    }
    
    //caso put
    
   @RequestMapping(value="/mensaje", method=RequestMethod.PUT, headers = {"Accept=application/json"})
    public Estatus actualizar(@RequestBody String json)throws Exception{
        Estatus e=new Estatus();
        e.setSuccess(true);
                 ObjectMapper  maper=new ObjectMapper();
         Mensaje mensa=        maper.readValue(json, Mensaje.class);
         repoMensaje.save(mensa);
         System.out.println("El titulo es: "+mensa.getTitulo()+ " el cuerpo es: "+mensa.getCuerpo());
        return e;
    } 
    
    
    
}
