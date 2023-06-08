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
public class Barco {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected int matricula;
    protected double tamanio;
    protected int anioFab;

    public Barco() {
    }

    public Barco(int matricula, double tamanio, int anioFab) {
        this.matricula = matricula;
        this.tamanio = tamanio;
        this.anioFab = anioFab;
    }

    public void crearBarco(){
        System.out.println("Ingrese el número de matrícula: ");
        matricula = leer.nextInt();
        System.out.println("Ingrese la eslora: ");
        tamanio = leer.nextDouble();
        System.out.println("Ingrese el año de fabricación: ");
        anioFab = leer.nextInt();
    }

    public double modulo() {
        return 10 * tamanio;
    }
}
    

