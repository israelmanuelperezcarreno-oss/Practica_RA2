package com.practicara2.gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

/**
 * Segunda Ventana de la aplicacion grafica.
 * Muestra el mensaje requerido y permite el retorno a la ventana anterior.
 * 
 * @author Israel Manuel Pérez Carreño
 */
public class SegundaVentana extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Constructor de la Segunda Ventana.
     */
    public SegundaVentana() {
        setTitle("Práctica RA2 - Segunda Pantalla");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 440, 280);
        
        contentPane = new JPanel();
        contentPane.setBackground(new Color(248, 250, 252));
        contentPane.setBorder(new EmptyBorder(15, 15, 15, 15));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        // Panel superior verde de confirmación
        JPanel panelHeader = new JPanel();
        panelHeader.setBackground(new Color(16, 185, 129));
        panelHeader.setBounds(0, 0, 440, 50);
        contentPane.add(panelHeader);
        panelHeader.setLayout(null);
        
        JLabel lblHeader = new JLabel("Navegación Exitosa");
        lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
        lblHeader.setForeground(Color.WHITE);
        lblHeader.setFont(new Font("Segoe UI", Font.BOLD, 15));
        lblHeader.setBounds(10, 12, 420, 25);
        panelHeader.add(lblHeader);
        
        // Texto obligatorio solicitado en el enunciado de la practica
        JLabel lblMensaje = new JLabel("Esta es la segunda pantalla");
        lblMensaje.setHorizontalAlignment(SwingConstants.CENTER);
        lblMensaje.setForeground(new Color(15, 23, 42));
        lblMensaje.setFont(new Font("Segoe UI", Font.BOLD, 20));
        lblMensaje.setBounds(20, 75, 384, 35);
        contentPane.add(lblMensaje);
        
        JLabel lblDescripcion = new JLabel("Ventana invocada mediante el evento ActionListener del botón principal.");
        lblDescripcion.setHorizontalAlignment(SwingConstants.CENTER);
        lblDescripcion.setForeground(new Color(100, 116, 139));
        lblDescripcion.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        lblDescripcion.setBounds(10, 115, 404, 20);
        contentPane.add(lblDescripcion);
        
        // Boton para cerrar esta ventana
        JButton btnCerrar = new JButton("Volver / Cerrar Ventana");
        btnCerrar.setFont(new Font("Segoe UI", Font.BOLD, 13));
        btnCerrar.setForeground(Color.WHITE);
        btnCerrar.setBackground(new Color(71, 85, 105));
        btnCerrar.setFocusPainted(false);
        btnCerrar.setBorder(new LineBorder(new Color(51, 65, 85), 1, true));
        btnCerrar.setBounds(120, 165, 190, 40);
        
        btnCerrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // Cierra unicamente esta ventana liberando sus recursos
            }
        });
        contentPane.add(btnCerrar);
    }
}
