/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia_ejercicio03;

import Entidades.Electrodomesticos;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Herencia_Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Electrodomesticos> lista = new ArrayList();
        Electrodomesticos ele = new Electrodomesticos();

        String op;

        do {
            System.out.println("------------------MENU--------------------");
            System.out.println("Desea comprar un televisor o una lavadora? ");

            System.out.println("A - Lavadora");
            System.out.println("B - Televisor");
            System.out.println("C - Precio total de electrodomésticos");
            System.out.println("D - Precio individual");
            System.out.println("E - Salir");
            System.out.println("------------------@@@@--------------------");
            op = leer.next();

            switch (op.toUpperCase()) {

                case "A":
                    Lavadora lav = new Lavadora();
                    lav.crearLavadora();
                    lista.add(lav);
                    System.out.println("El precio de su lavadora es: " + lav.getPrecio());
                    lav.precioFinal();
                    

                    System.out.println(lav.toString());
                    break;

                case "B":
                    Televisor tele = new Televisor();
                    tele.crearTelevidor();
                    System.out.println("El precio de su televisor es: " + tele.getPrecio());
                    tele.precioFinal();
                    
                    lista.add(tele);
                    System.out.println(tele.toString());
                    break;

                case "C":
                    double sum = 0;
                    for (Electrodomesticos electro : lista) {
                        sum += electro.precioFinal();
                        System.out.println("Precio total de electrodomésticos: $ " + sum);
                    }
                    break;

                case "D":
                    for (Electrodomesticos elect : lista) {
                        elect.precioFinal();
                    }
                    break;

                case "E":
                    System.out.println("Gracias por elegir nuestros electrodomésticos!");
                    break;

                default:
                    System.out.println("Ingrese opoción válida");
            }

        } while (!(op.equalsIgnoreCase("E")));
       

    }

}
