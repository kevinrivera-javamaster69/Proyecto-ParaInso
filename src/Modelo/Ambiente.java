
package Modelo;

public class Ambiente {
    private int id;
    private String nombre;
    private int box;
    
    public Ambiente(){
        
    }

    public Ambiente(int id, String nombre, int box) {
        this.id = id;
        this.nombre = nombre;
        this.box = box;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getBox() {
        return box;
    }

    public void setBox(int box) {
        this.box = box;
    }

    
    
}
