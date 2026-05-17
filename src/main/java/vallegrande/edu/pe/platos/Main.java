package vallegrande.edu.pe.platos;

import vallegrande.edu.pe.platos.view.BienvenidaView;

import vallegrande.edu.pe.platos.model.Pedido;
import vallegrande.edu.pe.platos.view.PedidoView;
import vallegrande.edu.pe.platos.controller.PedidoController;

public class Main {

    public static void main(String[] args) {

        BienvenidaView vista = new BienvenidaView();
        vista.setVisible(true);

        Pedido pedido = new Pedido(
                1,
                "Daniel",
                50.00,
                "Pendiente"
        );

        PedidoView pedidoView = new PedidoView();

        PedidoController controller =
                new PedidoController(pedido, pedidoView);

        controller.mostrarPedido();

    }
}