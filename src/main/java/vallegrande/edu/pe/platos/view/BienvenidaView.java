package vallegrande.edu.pe.platos.view;

import javax.swing.*;
import java.awt.*;

public class BienvenidaView extends JFrame {

    public BienvenidaView() {

        setTitle("Sistema Restaurante");

        setSize(500,350);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(
                EXIT_ON_CLOSE
        );

        setLayout(null);

        JLabel titulo =
                new JLabel(
                        "Sistema de Pedidos"
                );

        titulo.setBounds(
                120,
                70,
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

        JButton btnIniciar =
                new JButton("Iniciar");

        btnIniciar.setBounds(
                170,
                170,
                140,
                40
        );

        add(btnIniciar);

        btnIniciar.addActionListener(e -> {

            MenuPrincipalView menu =
                    new MenuPrincipalView();

            menu.setVisible(true);

            dispose();

        });

    }
}