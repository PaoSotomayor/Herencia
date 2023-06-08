/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Interfaz.Interface;

/**
 *
 * @author user
 */
public class Animal implements Interface {
    protected String nombre;
    protected int edad;
    protected String raza;  
    protected  String alimento;
    
    public Animal() {
        
    }

    public Animal(String nombre, int edad, String raza, String alimento) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.alimento = alimento;
    }

    @Override
    public void alimentarse() {
       
    }
    
}
