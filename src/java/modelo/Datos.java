package modelo;

import java.util.ArrayList;

public class Datos {

    private static Datos instancia;
    private int ID;
    private ArrayList<Cliente> lista;

    public static Datos getOrCreate() {
        if (instancia == null) {
            instancia = new Datos();
        }
        
        return instancia;
    }
    
    private Datos() {
        ID = 1;
        lista = new ArrayList<>();
    }
    
    public int siguienteID() {
        return ++ID;
    }

    // <editor-fold defaultstate="collapsed" desc="getters y setters">
    
    public ArrayList<Cliente> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Cliente> lista) {
        this.lista = lista;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    // </editor-fold>
    
}