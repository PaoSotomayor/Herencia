/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author user
 */
public class Gato extends Animal {

    public Gato() {
    }

    public Gato(String nombre, int edad, String raza, String alimento) {
        super(nombre, edad, raza, alimento);
    }

   @Override
    public void alimentarse() {
        System.out.println("El gato " + this.nombre + " se alimenta con " + this.alimento);
    }
    
    
}
