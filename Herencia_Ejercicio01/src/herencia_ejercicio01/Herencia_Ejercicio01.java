/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia_ejercicio01;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

/**
 *
 * @author user
 */
public class Herencia_Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal a = new Perro("Khaleesi", 8, "callejera", "pepas");
        a.alimentarse();
        Animal b = new Gato("Manuco", 4, "callejero", "atún");
        b.alimentarse();
        Animal c = new Caballo("Lucky", 8, "percherón", "alfalfa");
        c.alimentarse();
    }
    
}
