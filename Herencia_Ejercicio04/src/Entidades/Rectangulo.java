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
public class Rectangulo implements Formas_Interface {
    protected double base, altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    

    @Override
    public void area() {
        double area = (base * altura);
        System.out.println("El área del rectángulo es: " + area);
    }

    @Override
    public void perimetro() {
        double perimetro = (base * altura) * 2;
        System.out.println("El perímetro del rectángulo es: " + perimetro);
    }
    
}
