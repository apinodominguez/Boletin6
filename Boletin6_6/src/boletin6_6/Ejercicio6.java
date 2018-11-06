package boletin6_6;

import javax.swing.JOptionPane;

public class Ejercicio6 {
    public void calcularConsumo(){
        String nome = JOptionPane.showInputDialog("Introduce el nombre del producto: ");
        int numVendas = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de ventas del producto"));
        
        if (numVendas <= 100){
            JOptionPane.showMessageDialog(null,"El producto " + nome + " tiene un indice de venta bajo");
        }
        else if (numVendas <= 500){
            JOptionPane.showMessageDialog(null,"El producto " + nome + " tiene un indice de venta medio");
        }
        else if (numVendas <= 1000){
            JOptionPane.showMessageDialog(null,"El producto " + nome + " tiene un indice de venta alto");
        }
        else if (numVendas > 1000){
            JOptionPane.showMessageDialog(null,"El producto " + nome + " es de primera necesidad");
        }
        else{
            JOptionPane.showMessageDialog(null,"El producto " + nome + " no tiene ningun tipo de indice de venta");
        }
    }
}
