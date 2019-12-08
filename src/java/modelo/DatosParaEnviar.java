package modelo;

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;

public class DatosParaEnviar {

    private Hashtable<String, String> data;
    private Hashtable<String, String> notification;
    private String priority;
    
    private List<String> registration_ids;

    public DatosParaEnviar() {
        data = new Hashtable<>();
        notification = new Hashtable<>();
        registration_ids = new LinkedList<>();
        priority = "high";
        registration_ids.add("");
    }
    
    public DatosParaEnviar(String token, String mensaje) {
        data = new Hashtable<>();
        data.put("tipo", "mensaje");
        data.put("mensaje", mensaje);
        
        notification = new Hashtable<>();
        registration_ids = new LinkedList<>();
        priority = "high";
        
        registration_ids.add(token);
    }
    
}