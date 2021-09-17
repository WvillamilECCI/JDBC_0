package test;

import Domain.*;
import datos.*;
import java.util.*;

public class TestManejoPersona {
    
    public static void main(String[] args) {
        
        PersonaDAO personadao = new PersonaDAO();
        
        
        //Insertando un nuevo objeto de tipo persona
//        Persona personaNueva = new Persona("Carlos", "Esparza", "cesparza@mail.com", "554456587");
//        personadao.insertar(personaNueva);

//      Modificar

//        Persona personaModificar = new Persona(4, "Karlos", "Esparsa", "cesparsa@mail.com", "5544565875");
//        personadao.actualizar(personaModificar);

//      Eliminar

        Persona personaEliminar = new Persona(4);
        personadao.eliminar(personaEliminar);
        
        //Select
        List <Persona> personas = personadao.seleccionar();
        for (Persona persona : personas) {
            
            System.out.println("persona = " + persona);
            
        }
        
    }
    
}
