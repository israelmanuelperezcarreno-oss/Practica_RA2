package com.practicara2.gui;

import java.awt.EventQueue;
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
 * Ventana Principal de la aplicacion grafica.
 * Diseñada visualmente mediante el plugin WindowBuilder en Eclipse.
 * 
 * @author Israel Manuel Pérez Carreño
 */
public class VentanaPrincipal extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Punto de entrada de la aplicacion.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    VentanaPrincipal frame = new VentanaPrincipal();
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Constructor que inicializa y configura los componentes visuales de la ventana.
     */
    public VentanaPrincipal() {
        setTitle("Práctica RA2 - Ventana Principal (WindowBuilder)");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 480, 320);
        
        contentPane = new JPanel();
        contentPane.setBackground(new Color(245, 247, 250));
        contentPane.setBorder(new EmptyBorder(15, 15, 15, 15));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        // Panel superior para encabezado
        JPanel panelHeader = new JPanel();
        panelHeader.setBackground(new Color(30, 41, 59));
        panelHeader.setBounds(0, 0, 480, 60);
        contentPane.add(panelHeader);
        panelHeader.setLayout(null);
        
        JLabel lblTitulo = new JLabel("Entornos de Desarrollo - RA2");
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulo.setForeground(Color.WHITE);
        lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 17));
        lblTitulo.setBounds(10, 15, 460, 30);
        panelHeader.add(lblTitulo);
        
        // Etiqueta de bienvenida requerida en la practica
        JLabel lblBienvenido = new JLabel("¡Bienvenido a la App!");
        lblBienvenido.setHorizontalAlignment(SwingConstants.CENTER);
        lblBienvenido.setForeground(new Color(30, 41, 59));
        lblBienvenido.setFont(new Font("Segoe UI", Font.BOLD, 22));
        lblBienvenido.setBounds(20, 85, 424, 35);
        contentPane.add(lblBienvenido);
        
        JLabel lblSubtitulo = new JLabel("Aplicación con dos ventanas desarrollada con Eclipse y WindowBuilder");
        lblSubtitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lblSubtitulo.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        lblSubtitulo.setForeground(new Color(100, 116, 139));
        lblSubtitulo.setBounds(20, 125, 424, 20);
        contentPane.add(lblSubtitulo);
        
        JLabel lblAutor = new JLabel("Alumno: Israel Manuel Pérez Carreño");
        lblAutor.setHorizontalAlignment(SwingConstants.CENTER);
        lblAutor.setFont(new Font("Segoe UI", Font.ITALIC, 11));
        lblAutor.setForeground(new Color(71, 85, 105));
        lblAutor.setBounds(20, 145, 424, 20);
        contentPane.add(lblAutor);
        
        // Boton para abrir la segunda ventana
        JButton btnAbrirSegunda = new JButton("Abrir Segunda Pantalla");
        btnAbrirSegunda.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btnAbrirSegunda.setForeground(Color.WHITE);
        btnAbrirSegunda.setBackground(new Color(37, 99, 235));
        btnAbrirSegunda.setFocusPainted(false);
        btnAbrirSegunda.setBorder(new LineBorder(new Color(29, 78, 216), 1, true));
        btnAbrirSegunda.setBounds(120, 195, 224, 45);
        
        // Evento ActionListener: abre la segunda ventana
        btnAbrirSegunda.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SegundaVentana ventana2 = new SegundaVentana();
                ventana2.setLocationRelativeTo(VentanaPrincipal.this);
                ventana2.setVisible(true);
            }
        });
        contentPane.add(btnAbrirSegunda);
    }
}
