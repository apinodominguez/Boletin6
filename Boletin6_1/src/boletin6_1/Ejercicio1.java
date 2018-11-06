package boletin6_1;
import javax.swing.JOptionPane;

public class Ejercicio1 {
    public void numPositivo() {
        double num = Double.parseDouble(JOptionPane.showInputDialog("teclea cualquier numero: "));
        if (num < 0){
            JOptionPane.showMessageDialog(null, "el numero introducido es negativo");
        }
        else {
            JOptionPane.showMessageDialog(null, "El numero introducido es positivo");
        }
}
}
