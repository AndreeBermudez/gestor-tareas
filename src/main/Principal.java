
package main;

import frames.Tareas;

public class Principal {
    public static void main(String[] args) {
        Tareas ventana = new Tareas();
        ventana.setTitle("Tareas");
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(true);
    }
}
