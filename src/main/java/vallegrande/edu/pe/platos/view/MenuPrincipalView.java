package vallegrande.edu.pe.platos.view;

import javax.swing.*;
import java.awt.*;

public class MenuPrincipalView extends JFrame {

    public MenuPrincipalView() {

        setTitle("Menú Principal");

        setSize(500,350);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(
                EXIT_ON_CLOSE
        );

        setLayout(null);

        JLabel titulo =
                new JLabel("MENÚ PRINCIPAL");

        titulo.setBounds(
                120,
                50,
                300,
                40
        );

        titulo.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        25
                )
        );

        add(titulo);

        JButton btnPlatos =
                new JButton(
                        "Gestión de Platos"
                );

        btnPlatos.setBounds(
                140,
                130,
                200,
                40
        );

        add(btnPlatos);

        JButton btnPedidos =
                new JButton(
                        "Pedidos"
                );

        btnPedidos.setBounds(
                140,
                190,
                200,
                40
        );

        add(btnPedidos);

        btnPlatos.addActionListener(e -> {

            PlatoView plato =
                    new PlatoView();

            plato.setVisible(true);

            dispose();

        });

    }
}