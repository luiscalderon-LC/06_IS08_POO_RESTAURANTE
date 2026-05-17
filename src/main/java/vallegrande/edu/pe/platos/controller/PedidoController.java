package vallegrande.edu.pe.platos.controller;

import vallegrande.edu.pe.platos.model.Pedido;
import vallegrande.edu.pe.platos.view.PedidoView;

public class PedidoController {

    private Pedido pedido;
    private PedidoView vista;

    public PedidoController(Pedido pedido, PedidoView vista) {
        this.pedido = pedido;
        this.vista = vista;
    }

    public void mostrarPedido() {
        vista.mostrarPedido(pedido);
    }
}