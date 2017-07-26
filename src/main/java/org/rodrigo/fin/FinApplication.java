package org.rodrigo.fin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FinApplication implements CommandLineRunner {
@Autowired RepositorioUsuario repoUsu;
	public static void main(String[] args) {
		SpringApplication.run(FinApplication.class, args);
	
            // probar el guardar
            
        }

    @Override
    public void run(String... strings) throws Exception {
 
                   Direccion d=new Direccion("nada","hola",123l);
            Usuario u=new Usuario ("1","rodrigo","rvilcches@",d);
            Usuario guardado=repoUsu.save(u);
            System.out.println("giuardado con el rfc "+guardado.getRfc());
 
    }
        
        }
        
        

