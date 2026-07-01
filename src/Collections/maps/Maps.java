package Collections.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import models.Contacto;

public class Maps {
    //Set <V>

    //Map<K,V>
    //Map<TipoClave,tipoValor>
     //Map<String,Integer>
    public Map<String,Integer> construirHashMap(){

        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("A", 10);
        mapa.put("B", 20);
        mapa.put("C", 30);
        mapa.put("A", 50);
        System.out.println(mapa.size());
        System.out.println(mapa);

        for (int i = 0; i < mapa.size(); i++) {
            //utiliza un arreglo
            System.out.println(mapa.values().toArray()[i]);
        }

        for (String Key : mapa.keySet()) {
            //se usa set por la llave
            System.out.println(Key);
        }

        System.out.println(mapa.get("A"));
        System.out.println(mapa.get("B"));
        System.out.println(mapa.get("F"));
       //agrega si no existia pero si existe no hace nada
        mapa.putIfAbsent("F",100);
        mapa.putIfAbsent("A",200);

        System.out.println("--------------------------");
        System.out.println(mapa);
        
        
        return mapa;

    }

    public Map<String,Integer> cLinkedHashMap(){

        Map<String, Integer> mapa = new LinkedHashMap<>();
        mapa.put("A", 10);
        mapa.put("B", 20);
        mapa.put("C", 30);
        mapa.put("A", 50);

        return mapa;
    }

    public Map<String,Integer> cTreeMap(){

        Map<String, Integer> mapa = new TreeMap<>();
        mapa.put("A", 10);
        mapa.put("B", 20);
        mapa.put("C", 30);
        mapa.put("A", 50);

        return mapa;
    }

    // public List<Contacto> ordenarUnicos(List<Contacto> contactos){
    //   //Retornar contactos unicos
    //   //Unicos -> nombre
    //   Set<Contacto> nueva = new TreeSet<>(
    //     (c1,c2)->{
    //         if(c1.getNombre().equals(c2.getNombre())){
    //             return 0;
    //         }
    //         return c1.getApellido().compareTo(c2.getApellido());
    //     }
    //   );

    //   for(Contacto contacto1 : nueva.size()){
    //     nueva.add(contacto1);
    //   }
      // ordene segun el apellido de manera descendente

        
}
    

