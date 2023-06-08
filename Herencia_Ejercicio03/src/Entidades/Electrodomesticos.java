/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

//Electrodoméstico con los siguientes atributos: precio, color, 
import static java.lang.Character.toUpperCase;
import java.util.Scanner;

// consumo energético (letras entre A y F) y peso.  
// Los constructores que se deben implementar son los siguientes: 
// • Un constructor vacío. 
// • Un constructor con todos los atributos pasados por parámetro. 
// Los métodos a implementar son:  
// • Métodos getters y setters de todos los atributos. 
public class Electrodomesticos {

    protected Scanner leer = new Scanner(System.in).useDelimiter("\n");

    protected double precio;
    protected String color;
    protected char consumoEnergetico;

    protected double peso;

    public Electrodomesticos() {
        this.precio = 1000;
    }

    public Electrodomesticos(double precio, String color, char consumoEnergetico, int peso) {
        this.precio = precio;
        this.color = color;
//       
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }


    protected void comprobarConsumoEnergetico(char letra) {

        if ((letra <= 'A' && letra < 'F')) {
            consumoEnergetico = letra;
        }else {
            consumoEnergetico = 'F';
        }
    }

    protected void comprobarColor(String colorA) {
        if (!(color.equalsIgnoreCase("Blanco")
                || colorA.equalsIgnoreCase("Negro")
                || colorA.equalsIgnoreCase("Rojo")
                || colorA.equalsIgnoreCase("Azul")
                || colorA.equalsIgnoreCase("Gris"))) {
            color = "Blanco";
        }

    }


    protected void crearElectrodomestico() {
      
        System.out.println("Ingrese el color de su preferencia");
        color = leer.next();
        comprobarColor(color);
        System.out.println("Ingrese el Consumo Energético de su preferencia");
        consumoEnergetico = leer.next().charAt(consumoEnergetico);
        consumoEnergetico = toUpperCase( consumoEnergetico);
         comprobarConsumoEnergetico(consumoEnergetico);
        System.out.println("Ingrese el peso de su preferencia");
        peso = leer.nextInt();
        precio = 1000;

    }


    public double precioFinal() {
        double precioFin = precio;
        switch (consumoEnergetico) {
            case 'A':
                precioFin += 1000;
                break;
            case 'B':
                precioFin += 800;
                break;
            case 'C':
                precioFin += 600;
                break;
            case 'D':
                precioFin += 500;
                break;
            case 'E':
                precioFin += 300;
                break;
            case 'F':
                precioFin += 100;
                break;
        }
        if (peso >= 0 && peso <= 19) {
            precioFin += 100;
        }
        if (peso >= 20 && peso <= 49) {
            precioFin += 500;
        }
        if (peso >= 50 && peso <= 79) {
            precioFin += 800;
        }
        if (peso >= 80) {
            precioFin += 1000;
        }
        System.out.println("Precio Final " + precioFin);
        return precioFin;
    }

}

