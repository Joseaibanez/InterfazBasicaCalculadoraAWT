package com.mycompany.calculadoraawt;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class CalculadoraSimple extends Frame {

    CalculadoraSimple() {
        Panel panelPrincipal = new Panel(new BorderLayout());
        setTitle("Calculadora muy simple");
        add(panelPrincipal);
        
        
        Panel marcoPantalla = new Panel();
        marcoPantalla.setBackground(Color.white);
        TextField pantalla = new TextField(10);
        pantalla.setForeground(Color.white);
        pantalla.setFont(new Font("Arial", Font.PLAIN, 30));
        pantalla.setBackground(Color.gray);
        marcoPantalla.add(pantalla);
        panelPrincipal.add(marcoPantalla, BorderLayout.NORTH);
        
        
        Panel teclado = new Panel(new GridLayout(4,3));
        teclado.setBackground(Color.gray);
        panelPrincipal.add(teclado, BorderLayout.CENTER);
        
        
        Button[] teclas;
        teclas = new Button[] {
            new Button("1"),
            new Button("2"),
            new Button("3"),
            new Button("4"),
            new Button("5"),
            new Button("6"),
            new Button("7"),
            new Button("8"),
            new Button("9"),
            new Button("."),
            new Button("0"),
            new Button("C"),
            new Button("/"),
            new Button("x"),
            new Button("-"),
            new Button("+"),
            new Button("=")
        };
        
        for(Button tecla : teclas) {
            teclado.add(tecla);
            tecla.setFont(new Font("Arial", Font.PLAIN, 30));
            tecla.setBackground(Color.black);
            tecla.setForeground(Color.white);

            teclado.add(tecla);
        }
    }
    public static void main(String[] args) {
        CalculadoraSimple calculadora = new CalculadoraSimple();
        calculadora.setVisible(true);
        calculadora.setBounds(200,200,350, 450);
        calculadora.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    
}
