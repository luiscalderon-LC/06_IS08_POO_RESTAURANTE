package vallegrande.edu.pe.platos.model;

public class Pedido {

    private int id;
    private String cliente;
    private double total;
    private String estado;

    public Pedido(int id, String cliente, double total, String estado) {
        this.id = id;
        this.cliente = cliente;
        this.total = total;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public String getCliente() {
        return cliente;
    }

    public double getTotal() {
        return total;
    }

    public String getEstado() {
        return estado;
    }
}