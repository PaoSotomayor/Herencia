/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia_ejercicioextra02;

import Entidades.Edificio;
import Entidades.EdificioDeOficinas;
import Entidades.Polideportivo;
import java.util.ArrayList;
import java.util.Scanner;

/*Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase edificio tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico.
Estos métodos serán abstractos y los implementarán las siguientes clases:
• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o Abierto, esta clase implementará los dos métodos abstractos 
y los atributos del padre.
• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas por oficina y número de pisos. Esta clase 
implementará los dos métodos abstractos y los atributos del padre.
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el usuario dirá cuántas personas 
entran en cada oficina, cuantas oficinas y el número de piso (suponiendo que en cada piso hay una oficina). 
Crear el método cantPersonas(), que muestre cuantas personas entrarían en un piso y cuantas en todo el edificio.
Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener dos polideportivos y
dos edificios de oficinas. Luego, recorrer este array y ejecutar los métodos calcularSuperficie y calcularVolumen en cada Edificio. 
Se deberá mostrar la superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son techados y cuantos abiertos. Y para la clase 
EdificioDeOficinas deberemos llamar al método cantPersonas() y mostrar los resultados de cada edificio de oficinas.
 */
public class Herencia_EjercicioExtra02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ArrayList<Edificio> edificios = new ArrayList();
        
       String op;
        int canP = 0, cantO = 0;
        do {
            System.out.println("----Menu----");
            System.out.println("Qué desea crear?");
            System.out.println("A- Polideportivo");
            System.out.println("B- Edificio de Oficina");
            System.out.println("C- Salir");
            op = leer.next();

            switch (op.toUpperCase()) {
                case "A":
                    edificios.add(new Polideportivo().crearPolideportivo());
                    canP++;
                    break;

                case "B":
                    cantO++;
                    edificios.add(new EdificioDeOficinas().crearEdificioDeOficinas());
                    break;

                case "C":
                    System.out.println("Saliendo. Gracias");
                    break;
                default:
                    System.out.println("Ingrese opción valida");
            }

            System.out.println("---------------");
            System.out.println("Existen " + canP + " polideportivos y " + cantO + " de edificios de oficinas.");
            System.out.println("---------------");

        } while ((!(op.equalsIgnoreCase("C"))));

    }
}
