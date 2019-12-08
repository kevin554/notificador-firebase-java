package modelo;

public class Cliente {

    private int ID;
    private String nombre;
    private String token;

    public Cliente() {
    }

    public Cliente(int ID, String nombre, String token) {
        this.ID = ID;
        this.nombre = nombre;
        this.token = token;
    }
    
    // <editor-fold defaultstate="collapsed" desc="getters y setters">

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
    
    // </editor-fold>
    
}