package vallegrande.edu.pe.platos.view;

import vallegrande.edu.pe.platos.model.Pedido;

public class PedidoView {

    public void mostrarPedido(Pedido pedido) {

        System.out.println("===== PEDIDO =====");
        System.out.println("ID: " + pedido.getId());
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Total: S/ " + pedido.getTotal());
        System.out.println("Estado: " + pedido.getEstado());
    }
}