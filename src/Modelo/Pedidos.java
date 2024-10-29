package Modelo;

public class Pedidos {
    private int id;
    private int id_ambiente;
    private int num_box;
    private String fecha;
    private double total;
    private String ambiente;
    private String usuario;
    private String estado;

    public Pedidos() {
    }

    public Pedidos(int id, int id_ambiente, int num_box, String fecha, double total, String ambiente, String usuario, String estado) {
        this.id = id;
        this.id_ambiente = id_ambiente;
        this.num_box = num_box;
        this.fecha = fecha;
        this.total = total;
        this.ambiente = ambiente;
        this.usuario = usuario;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_ambiente() {
        return id_ambiente;
    }

    public void setId_ambiente(int id_ambiente) {
        this.id_ambiente = id_ambiente;
    }

    public int getNum_box() {
        return num_box;
    }

    public void setNum_box(int num_box) {
        this.num_box = num_box;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
        
}
