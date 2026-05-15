package vallegrande.edu.pe.platos.controller;

import vallegrande.edu.pe.platos.model.Conexion;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PlatoController {

    public void listar(
            JTable tabla,
            JLabel contador
    ) {

        DefaultTableModel modelo =
                new DefaultTableModel();

        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Categoría");
        modelo.addColumn("Precio");
        modelo.addColumn("Estado");

        int total = 0;

        try {

            Connection con =
                    Conexion.conectar();

            PreparedStatement ps =
                    con.prepareStatement(
                            "SELECT * FROM platos"
                    );

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                modelo.addRow(new Object[]{

                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("categoria"),
                        rs.getDouble("precio"),
                        rs.getString("estado")

                });

                total++;

            }

            tabla.setModel(modelo);

            contador.setText(
                    "Total de platos: " + total
            );

        } catch (Exception e) {

            JOptionPane.showMessageDialog(
                    null,
                    "Error: " + e.getMessage()
            );

        }

    }

    public void registrar(
            String nombre,
            String categoria,
            String precio,
            String estado
    ) {

        if (
                nombre.isEmpty()
                        || categoria.isEmpty()
                        || precio.isEmpty()
        ) {

            JOptionPane.showMessageDialog(
                    null,
                    "Todos los campos son obligatorios"
            );

            return;
        }

        try {

            Connection con =
                    Conexion.conectar();

            PreparedStatement ps =
                    con.prepareStatement(
                            "INSERT INTO platos(nombre,categoria,precio,estado) VALUES(?,?,?,?)"
                    );

            ps.setString(1, nombre);
            ps.setString(2, categoria);
            ps.setDouble(3,
                    Double.parseDouble(precio));
            ps.setString(4, estado);

            ps.executeUpdate();

            JOptionPane.showMessageDialog(
                    null,
                    "Plato registrado"
            );

        } catch (Exception e) {

            JOptionPane.showMessageDialog(
                    null,
                    "Error: " + e.getMessage()
            );

        }

    }
}