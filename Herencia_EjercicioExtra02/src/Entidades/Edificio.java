/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author user
 */
public abstract class Edificio {
    protected double ancho;
    protected double alto;
    protected double largo;
    protected Scanner leer = new Scanner(System.in);

    public Edificio() {
    }

    public Edificio(double ancho, double alto, double largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }
    

    
    public abstract void calcularSuperficie();
    public abstract void calcularVolumen();
}