/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia_ejercicio02;

import Entidades.Electrodomesticos;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Herencia_Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Electrodomesticos ele = new Electrodomesticos();

        String op;

        do {
            System.out.println("------------------MENU--------------------");
            System.out.println("Desea comprar un televisor o una lavadora? ");

            System.out.println("A - Lavadora");
            System.out.println("B - Televisor");
            System.out.println("C - Salir");
            System.out.println("------------------@@@@--------------------");
            op = leer.next();

            switch (op.toUpperCase()) {

                case "A":
                    Lavadora lav = new Lavadora();
                    lav.crearLavadora();
                    lav.precioFinal();
                    System.out.println("El precio de su lavadora es: " + lav.getPrecio());
                    System.out.println(lav.toString());
                    break;

                case "B":
                    Televisor tele = new Televisor();
                    tele.crearTelevidor();
                    tele.precioFinal();
                    System.out.println("El precio de su televisor es: " + tele.getPrecio());
                    System.out.println(tele.toString());
                    break;

                case "C":
                    System.out.println("Gracias por elegir nuestros electrodomésticos!");
                    break;

                default:
                    System.out.println("Ingrese opoción válida");
            }

        } while (!(op.equalsIgnoreCase("C")));

    }

}
