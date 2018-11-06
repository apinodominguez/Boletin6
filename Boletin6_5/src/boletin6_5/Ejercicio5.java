package boletin6_5;

import javax.swing.JOptionPane;

public class Ejercicio5 {
    public void mayorNumero(){
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el primer numero: "));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el segundo numero: "));
        double num3 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el tercer numero: "));
    if ((num1 > num2) && (num1 > num3)){
        JOptionPane.showMessageDialog(null, "El mayor numero es: " + num1);
    }
    else if ((num2 > num1) && (num2 > num3)){
        JOptionPane.showMessageDialog(null, "El mayor numero es: " + num2);
    }
    else if ((num3 > num1) && (num3 > num2)){
        JOptionPane.showMessageDialog(null, "El mayor numero es: " + num3);
    }
    else{
        JOptionPane.showMessageDialog(null,"No hay un numero que sea el mayor de los tres");
    }
    }
}