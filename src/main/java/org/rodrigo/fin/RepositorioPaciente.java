/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rodrigo.fin;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Sony
 */
public interface RepositorioPaciente extends MongoRepository <Paciente,String>{
    
}
