/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Comparator;
import java.util.Scanner;

/*Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de Pisos, Precio de Habitaciones.
 */
public class Hotel extends Alojamiento {
      protected Scanner leer = new Scanner(System.in);
    protected int cantHabitaciones, numCamas, cantPisos;
    protected double precioHabitacion;

    public Hotel() {
    }

    public Hotel(int cantHabitaciones, int numCamas, int cantPisos, double precioHabitacion) {
        this.cantHabitaciones = cantHabitaciones;
        this.numCamas = numCamas;
        this.cantPisos = cantPisos;
        this.precioHabitacion = precioHabitacion;
    }

    public Hotel(int cantHabitaciones, int numCamas, int cantPisos, double precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.numCamas = numCamas;
        this.cantPisos = cantPisos;
        this.precioHabitacion = precioHabitacion;
    }

    public double getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(double precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }
    

    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HOTEL ");
        sb.append("Nombre: ").append(nombre);
        sb.append(", Direccion: ").append(direccion);
        sb.append(", Localidad: ").append(localidad);
        sb.append(", Gerente a cargo: ").append(gerente);
        sb.append("Cantidad de Habitaciones: ").append(cantHabitaciones);
        sb.append(", Número de Camas: ").append(numCamas);
        sb.append(", Cantidad de Pisos: ").append(cantPisos);
        sb.append(", Precio por Habitación: u$ ").append(precioHabitacion);
        sb.append(' ');
        return sb.toString();
    }
    
     


  
    }
    
    

