/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia_ejercicio04;

import Entidades.Circulo;
import Entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Herencia_Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String op;
        do {
            System.out.println("---- Figuras ------");
            System.out.println("A- Crear círculo");
            System.out.println("B- Crear rectángulo");
            System.out.println("C- Salir");
            System.out.println("-------@@@@--------");
            op = leer.next();
            
            
            
            switch (op) {
                case "A":
                    Circulo c1 = new Circulo();
                    System.out.println("Ingrese el radio del círculo: ");
                    c1.setRadio(leer.nextDouble());
                    c1.area();
                    c1.perimetro();
                    break;
                     
                case "B":
                    Rectangulo r1 = new Rectangulo();
                    System.out.println("Ingrese la base del rectánfgulo: ");
                    r1.setBase(leer.nextDouble());
                    System.out.println("Ingrese la altura del rectángulo: ");
                    r1.setAltura(leer.nextDouble());
                    r1.area();
                    r1.perimetro();
                    break;
                     
                case "C":
                    System.out.println("Gracias por crear estas figuras!");
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
            }
            
        } while (!(op.equalsIgnoreCase("C")));
    }
    
}
