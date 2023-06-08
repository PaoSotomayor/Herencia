/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Interface.Formas_Interface;

/**
 *
 * @author user
 */
public class Circulo implements Formas_Interface {
    protected double radio;

    public Circulo() {
    }
    

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    

    @Override
    public void area() {
        double area = PI * (Math.pow(radio, 2));
        System.out.println("El área del círculo es: " + area);
    }

    @Override
    public void perimetro() {
        double perimetro = PI * (radio * 2);
        System.out.println("El perímetro del círculo es: " + perimetro);
    }
    
}
