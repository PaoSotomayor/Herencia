/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/*Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio, Nombre del Restaurante, Capacidad del Restaurante, 
Cantidad Salones de Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
 */
public class Hotel_5estrellas extends Hotel_4estrellas {

    protected int cantSalonConferencia, cantSuites, cantLimusine;

    public Hotel_5estrellas() {
    }

    public Hotel_5estrellas(int cantSalonConferencia, int cantSuites, int cantLimusine, char gimnasio, String nombRestaurante, int capRestaurante, int cantHabitaciones, int numCamas, int cantPisos, double precioHabitacion) {
        super(gimnasio, nombRestaurante, capRestaurante, cantHabitaciones, numCamas, cantPisos, precioHabitacion);
        this.cantSalonConferencia = cantSalonConferencia;
        this.cantSuites = cantSuites;
        this.cantLimusine = cantLimusine;
    }

    public Hotel_5estrellas(int cantSalonConferencia, int cantSuites, int cantLimusine, char gimnasio, String nombRestaurante, int capRestaurante, int cantHabitaciones, int numCamas, int cantPisos, double precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(gimnasio, nombRestaurante, capRestaurante, cantHabitaciones, numCamas, cantPisos, precioHabitacion, nombre, direccion, localidad, gerente);
        this.cantSalonConferencia = cantSalonConferencia;
        this.cantSuites = cantSuites;
        this.cantLimusine = cantLimusine;
         this.precioHabitacion = calcularPrecioHabitacion();
    }

 

   

//Valor agregado por las limosinas:(VA EN HOTEL5?)
//• $15 por la cantidad de limosinas del hotel.

    @Override
    public double calcularPrecioHabitacion() {
        return super.calcularPrecioHabitacion() + (15*cantLimusine);
        
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HOTEL ★★★★★ ");
        sb.append("Nombre: ").append(nombre);
        sb.append(", Direccion: ").append(direccion);
        sb.append(", Localidad: ").append(localidad);
        sb.append(", Gerente a cargo: ").append(gerente);
        sb.append(", Cantidad de Habitaciones: ").append(cantHabitaciones);
        sb.append(", Número de Camas: ").append(numCamas);
        sb.append(", Cantidad de Pisos: ").append(cantPisos);
        sb.append(", Precio por Habitación: u$ ").append(precioHabitacion);
        sb.append(", Gimnasio Tipo: ").append(gimnasio);
        sb.append(", Nombre del Restaurante: ").append(nombRestaurante);
        sb.append(", Capacidad del Restaurante: ").append(capRestaurante);
        sb.append(", Cantidad de Salones de Conferencia: ").append(cantSalonConferencia);
        sb.append(", Cantidad de Suites: ").append(cantSuites);
        sb.append(", Cantidad de Limusines: ").append(cantLimusine);
        sb.append('}');
        return sb.toString();
    }

}
