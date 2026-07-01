package eva;

import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import models.Persona;

public class PersonaController {
     public Set<Persona> filtrarYOrdenar(){
        Set<Persona> personasFiltradas = new TreeSet<>(
          (p1,p2)  -> {
             int comE = Integer.compare(p2.getEdad(),p2.getEdad());
             if(comE != 0){
                return 0;
             }
             int compN = p1.getNombre().compareToIgnoreCase(p2.getNombre());
             return compN;
          }
        );


return null;
     }

     public Map<String, set<String>> agruparPorEdad(){

        String nombre= "Juan Perez";
        String[] palabras = nombre.split(" ");
        String primernombre = palabras[0];

        String Nombre = nombre.split(" ")[0];
        //
        return null;
     }
    
}
