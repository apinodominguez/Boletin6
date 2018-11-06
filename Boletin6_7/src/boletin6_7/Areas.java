package boletin6_7;
import java.util.Scanner;

public class Areas {
    private final float PI = 3.14f;
    public void calcularAreas(){
        System.out.println("****MENU****\n 1--> Cuadrado\n 2--> Triangulo\n 3--> Circulo\n\n Elige una de las opciones");
        Scanner sc= new Scanner(System.in);
        int op = sc.nextInt();
        switch(op){
            case 1: System.out.println("Introduce el lado del cuadrado");
            Scanner var= new Scanner(System.in);
            double l = var.nextInt();
                System.out.println("El area del circulo es de: " +Math.pow(l, 2)+ "m²");
                break;
            
            case 2: System.out.println("Introduce la base del triangulo:");
            Scanner var2= new Scanner(System.in);
            double base = var2.nextInt();
            System.out.println("Introduce la altura del triangulo:");
            Scanner var3= new Scanner(System.in);
            double altura = var3.nextInt();
                System.out.println("El area del triangulo es de: " +base*altura/2+ "m²");
                break;
               
            case 3: System.out.println("Introduce el radio del circulo: ");
            Scanner var4= new Scanner(System.in);
            double radio = var4.nextInt();
                System.out.println("El area del circulo es de: " +PI*Math.pow(radio, 2));
                break;
                
            default : System.out.println("La opción introducida no es correcta");   
        }
    }
}
