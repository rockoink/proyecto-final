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

@RestController
@CrossOrigin

public class ControladorUsuario {
   @Autowired RepositorioUsuario repoUsu;
    
   //gUARDAR POST
   @RequestMapping(value="/usuario", method=RequestMethod.POST,
            headers={"Accept=Application/json"})
   
   public Usuario guardarUsuario(@RequestBody String json) throws Exception {
   ObjectMapper maper=new ObjectMapper();
        
        Usuario u=maper.readValue(json, Usuario.class);
        repoUsu.save(u);
         System.out.println("El rfc es: "+u.getRfc()+ " el nombre es: "+u.getNombre()+
                 "email"+u.getEmail()+"direccion"+u.getDireccion());
        return u;
   }
   
   //delete
    @RequestMapping(value="/usuario/{rfc}", method=RequestMethod.DELETE,
            headers={"Accept=Application/json"})
   
    public Estatus borrar(@PathVariable String rfc){
        
        
        repoUsu.delete(rfc);
        Estatus e=new Estatus();
         e.setSuccess(true);
         return e;
            }
    //buscar todos
       @RequestMapping(value="/usuario", method = RequestMethod.GET, headers = {"Accept=Application/json"})
    public ArrayList<Usuario> getTodos(){
         
        return (ArrayList<Usuario>) repoUsu.findAll();
    }
    
      //caso put usuario
    
   @RequestMapping(value="/usuario", method=RequestMethod.PUT, headers = {"Accept=application/json"})
    public Estatus actualizar(@RequestBody String json)throws Exception{
        ObjectMapper maper=new ObjectMapper();
        
        Usuario u=maper.readValue(json, Usuario.class);
        repoUsu.save(u);
         System.out.println("El rfc es: "+u.getRfc()+ " el nombre es: "+u.getNombre()+
                 "email"+u.getEmail()+"direccion"+u.getDireccion());
        Estatus e=new Estatus();
         e.setSuccess(true);
         return e;
         
         } 
    
    //buscar por id
@RequestMapping(value="/usuario/{rfc}", method=RequestMethod.GET,
            headers={"Application/json"})
   
    public Usuario buscarIdUsuario(@PathVariable String rfc){
        
        Usuario u=repoUsu.findOne(rfc);
        return u;
    
  
}
}