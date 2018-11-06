package boletin6_3;
import javax.swing.JOptionPane;

public class NegativoPositivo {
    public void negativoPositivo(){
        double num = Double.parseDouble(JOptionPane.showInputDialog("Tecle cualquier numero"));
        if (num > 0){
            JOptionPane.showMessageDialog(null, "El numero es positivo: +");
        }
        else if (num < 0){
            JOptionPane.showMessageDialog(null, "El numero es negativo: -");
        }
        else {
            JOptionPane.showMessageDialog(null, "El numero es 0");
        }
    }
    
}
