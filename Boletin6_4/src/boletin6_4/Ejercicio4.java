package boletin6_4;
import javax.swing.JOptionPane;

public class Ejercicio4 {
  
    public void mayorPeso(){
        
        String nome1 = JOptionPane.showInputDialog("Escriba el nombre de la primera persona: ");
        float peso1 = Float.parseFloat(JOptionPane.showInputDialog("Y su correspondiente peso: "));
        String nome2 = JOptionPane.showInputDialog("Escriba el nombre de la segunda persona: ");
        float peso2 = Float.parseFloat(JOptionPane.showInputDialog("Y su correspondiente peso: "));
    
    if (peso1 > peso2){
        JOptionPane.showMessageDialog(null,"La persona con mayor peso es " + nome1 + " con un peso de " + peso1 + "Kg, con una diferencia de " + (peso1 - peso2) + "Kg");
    }
    else if (peso1 < peso2){
                JOptionPane.showMessageDialog(null,"La persona con mayor peso es " + nome2 + " con un peso de " + peso2 + "Kg, con una diferencia de " + (peso2 - peso1) + "Kg");
    }
    else {
                JOptionPane.showMessageDialog(null,"Ambos pesan lo mismo");

    }
    }
    
    
    
}