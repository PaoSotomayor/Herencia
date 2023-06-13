/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/*Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio, Nombre del Restaurante, 
Capacidad del Restaurante, Precio de las Habitaciones.
Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo “B”, de acuerdo a las prestaciones observadas.
 */
public class Hotel_4estrellas extends Hotel {

    protected char gimnasio;
    protected String nombRestaurante;
    protected int capRestaurante;

    public Hotel_4estrellas() {
        
    }

    public Hotel_4estrellas(char gimnasio, String nombRestaurante, int capRestaurante, int cantHabitaciones, int numCamas, int cantPisos, double precioHabitacion) {
        super(cantHabitaciones, numCamas, cantPisos, precioHabitacion);
        this.gimnasio = gimnasio;
        this.nombRestaurante = nombRestaurante;
        this.capRestaurante = capRestaurante;
    }

    public Hotel_4estrellas(char gimnasio, String nombRestaurante, int capRestaurante, int cantHabitaciones, int numCamas, int cantPisos, double precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(cantHabitaciones, numCamas, cantPisos, precioHabitacion, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.nombRestaurante = nombRestaurante;
        this.capRestaurante = capRestaurante;
        this.precioHabitacion = calcularPrecioHabitacion();
    }

    
   
   

//El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula: 
//PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor agregado por gimnasio) + 
//(valor agregado por limosinas).
//Donde:
//Valor agregado por el restaurante:
//• $10 si la capacidad del restaurante es de menos de 30 personas.
//• $30 si está entre 30 y 50 personas.
//• $50 si es mayor de 50. Valor agregado por el gimnasio:
//• $50 si el tipo del gimnasio es A.
//• $30 si el tipo del gimnasio es B.
    
    public double calcularPrecioHabitacion() {
        //evaluando capacidad de restaurante
        double extra = 1;
        double precio = 50 + (extra * cantHabitaciones) + (valorAgregadoRest()) +  (valorAgregadoGym());       
       
        return precio;
    }

    public double valorAgregadoRest() {
        double precio = 0;

        if (capRestaurante < 30) {
            precio  = 10;
        } else if (capRestaurante >= 30 && capRestaurante <= 50) {
            precio=30;
        } else {
            precio=50;
        }
        return precio;
    }

    public double valorAgregadoGym() {
        double precio=0;
        if (gimnasio == 'A') {

        } else {
            precio=30;
        }
        return precio;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HOTEL ★★★★ ");
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
        sb.append(", Capacidad del Restaurante:").append(capRestaurante);
        sb.append(' ');
        return sb.toString();
    }
    
}
