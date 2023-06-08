/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author user
 */
public class Perro extends Animal{

    public Perro() {
    }

    public Perro(String nombre, int edad, String raza, String alimento) {
        super(nombre, edad, raza, alimento);
    }
@Override
    public void alimentarse() {
        System.out.println("El perro " + this.nombre + " se alimenta con " + this.alimento);
    }  
}
