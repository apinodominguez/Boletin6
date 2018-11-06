package boletin6_2;
import javax.swing.JOptionPane;

public class Ejercicio2 {
    public void restarSumar(){
        short num1 = Short.parseShort(JOptionPane.showInputDialog("Tecle el primer numero: "));
        short num2 = Short.parseShort(JOptionPane.showInputDialog("Tecle el segundo numero: "));

        if(num1 >= num2){
            JOptionPane.showMessageDialog(null, "La resta es de: " + (num1 - num2));
        }
        JOptionPane.showMessageDialog(null, "La suma es de: " + (num1 +num2));
    }
}
