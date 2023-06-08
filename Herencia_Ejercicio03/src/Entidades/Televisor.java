/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Scanner;

/*Se debe crear también una subclase llamada Televisor con los siguientes atributos: resolución (en pulgadas) y sintonizador TDT (booleano), 
además de los atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos heredados. Recuerda que debes llamar al constructor de la 
clase padre.
Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase padre, lo utilizamos para llenar los atributos heredados del 
padre y después llenamos los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente funcionalidad. Si el televisor tiene una resolución mayor de 
40 pulgadas, se incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará $500. Recuerda que las condiciones que 
hemos visto en la clase Electrodomestico también deben afectar al precio.
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar el precio final de los dos electrodomésticos.
 */
public class Televisor extends Electrodomesticos {

    protected int resolucion;
    protected boolean sintonizador;

//    Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase padre, lo utilizamos para llenar los atributos heredados del 
//padre y después llenamos los atributos del televisor.
//    
    public Televisor() {
    }

    public Televisor(double precio, String color, char consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
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

    public void setPeso(double peso) {
        this.peso = peso;
    }

//     Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase padre, lo utilizamos para llenar los atributos heredados del 
//padre y después llenamos los atributos del televisor.
    public void crearTelevidor() {
        crearElectrodomestico();
        System.out.println("Ingrese la resolución preferida para su televisor");
        this.resolucion = leer.nextInt();
        System.out.println("Desea una televión con sintonizador?");

        String op = leer.next();

        if (op.equalsIgnoreCase("Si")) {
            this.sintonizador = true;

        }else{
            this.sintonizador = false;
        }
    }
    
 @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Lavadora: ");
        sb.append("color: ").append(color);
        sb.append(" / consumo energetico: ").append(consumoEnergetico);
        sb.append(" / peso: ").append(peso);
        sb.append(" / resolucion: ").append(resolucion);

        sb.append("");
        return sb.toString();
    }
}

//    Método precioFinal(): este método será heredado y se le sumará la siguiente funcionalidad. Si el televisor tiene una resolución mayor de 
//40 pulgadas, se incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará $500. Recuerda que las condiciones que 
//hemos visto en la clase Electrodomestico también deben afectar al precio.
//    @Override
//    public void precioFinal() {
//        super.precioFinal();
//        if (this.resolucion > 40) {
//            this.precio = this.precio * 1.30;
//
//        }
//        if (this.sintonizador) {
//            this.precio += 500;
//        }
//
//    }
//}