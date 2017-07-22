/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rodrigo.fin;

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
    
   //get
   @RequestMapping(value="/usuario", method=RequestMethod.GET,
            headers={"Accept=text/html"})
   
   public String guardar() {
       
    Direccion d=new Direccion("calle 1","colonia 1",1L);
    Usuario u=new Usuario("1","rodrigo","rvilcches@",d);
             repoUsu.save(u);
       
       return "usuario guardado";
   }
   
   //delete
    @RequestMapping(value="/usuario", method=RequestMethod.DELETE,
            headers={"Accept=text/html"})
   
    public String borrar(@PathVariable String rfc){
        
        
        repoUsu.delete(rfc);
        
        return "usuario eliminado";
    }
}
