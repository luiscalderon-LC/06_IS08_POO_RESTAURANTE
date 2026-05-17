package vallegrande.edu.pe.platos.view;

import vallegrande.edu.pe.platos.controller.PlatoController;

import javax.swing.*;

public class PlatoView extends JFrame {

    JTextField txtNombre;
    JTextField txtCategoria;
    JTextField txtPrecio;

    JCheckBox chkDisponible;

    JTable tabla;

    JLabel lblContador;

    PlatoController controller =
            new PlatoController();

    public PlatoView() {

        setTitle("CRUD PLATOS");

        setSize(800,550);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(
                EXIT_ON_CLOSE
        );

        setLayout(null);

        JLabel titulo =
                new JLabel(
                        "GESTIÓN DE PLATOS"
                );

        titulo.setBounds(
                250,
                20,
                300,
                30
        );

        add(titulo);

        JLabel lblNombre =
                new JLabel("Nombre");

        lblNombre.setBounds(
                50,
                80,
                100,
                25
        );

        add(lblNombre);

        txtNombre =
                new JTextField();

        txtNombre.setBounds(
                150,
                80,
                200,
                25
        );

        add(txtNombre);

        JLabel lblCategoria =
                new JLabel("Categoría");

        lblCategoria.setBounds(
                50,
                120,
                100,
                25
        );

        add(lblCategoria);

        txtCategoria =
                new JTextField();

        txtCategoria.setBounds(
                150,
                120,
                200,
                25
        );

        add(txtCategoria);

        JLabel lblPrecio =
                new JLabel("Precio");

        lblPrecio.setBounds(
                50,
                160,
                100,
                25
        );

        add(lblPrecio);

        txtPrecio =
                new JTextField();

        txtPrecio.setBounds(
                150,
                160,
                200,
                25
        );

        add(txtPrecio);

        chkDisponible =
                new JCheckBox(
                        "Disponible"
                );

        chkDisponible.setBounds(
                150,
                200,
                150,
                25
        );

        add(chkDisponible);

        JButton btnRegistrar =
                new JButton(
                        "Registrar"
                );

        btnRegistrar.setBounds(
                420,
                80,
                150,
                35
        );

        add(btnRegistrar);

        tabla = new JTable();

        JScrollPane scroll =
                new JScrollPane(tabla);

        scroll.setBounds(
                50,
                270,
                680,
                150
        );

        add(scroll);

        lblContador =
                new JLabel(
                        "Total platos: 0"
                );

        lblContador.setBounds(
                50,
                450,
                200,
                30
        );

        add(lblContador);

        controller.listar(
                tabla,
                lblContador
        );

        btnRegistrar.addActionListener(e -> {

            String estado;

            if (chkDisponible.isSelected()) {

                estado = "Disponible";

            } else {

                estado = "No disponible";

            }

            controller.registrar(

                    txtNombre.getText(),
                    txtCategoria.getText(),
                    txtPrecio.getText(),
                    estado

            );

            controller.listar(
                    tabla,
                    lblContador
            );

        });

    }
}