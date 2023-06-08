/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Amarre {
    protected Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected String nombre;
    protected int documento;
    protected LocalDate fechaAlquiler;
    protected LocalDate fechaDevolucion;
    protected int posAmarre;
    protected Barco barco;

    public Amarre() {
    }

    public Amarre(String nombre, int documento, LocalDate fechaAlquiler, LocalDate fechaDevolucion, int posAmarre, Barco barco) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posAmarre = posAmarre;
        this.barco = barco;
    }
    
    public void crearUsuario(){         
        System.out.println("----------------");
        System.out.println("Ingrese su nombre: ");
        nombre = leer.next();
        System.out.println("Ingrese su documento: ");
        documento = leer.nextInt();        
        posAmarre = (int)(Math.random()*5);
        crearBarco();              
        System.out.println("----------------");
    }
    
    public void crearBarco() {        
        System.out.println("Que tipo de barco posee?: ");
        System.out.println("1 - Barco Motor");
        System.out.println("2 - Velero");
        System.out.println("3 - Yate=");
        int op = leer.nextInt();
        do {
            switch (op) {
                case 1:
                    BarcoMotor b1 = new BarcoMotor();
                    b1.crearBarco();
                    barco = b1;
                    break;
                case 2:
                    Velero v1 = new Velero();
                    v1.crearBarco();
                    barco = v1;
                    break;
                case 3:
                    Yate y1 = new Yate();
                    y1.crearBarco();
                    barco = y1;
                    break;
                default:
                    System.out.println("Ingrese opción válida");
            }
        } while ((op != 1) && (op != 2) && (op != 3));
        double precio = diasAlquiler()*barco.modulo();
        
        System.out.println("EL precio por el alquiler del amarre es: $" + precio);
    }

    public double diasAlquiler() {
        System.out.println("--------------------------------");
        System.out.println("Ingrese la fecha de amarre: ");
        System.out.println("Dia: ");
        int diaA = leer.nextInt();
        System.out.println("Mes: ");
        int mesA = leer.nextInt();
        System.out.println("Año: ");
        int anioA = leer.nextInt();
        fechaAlquiler = LocalDate.of(anioA, mesA, diaA);
        System.out.println("--------------------------------");

        System.out.println("--------------------------------");
        System.out.println("Ingrese la fecha de salida: ");
        System.out.println("Día: ");
        int diaR = leer.nextInt();
        System.out.println("Mes: ");
        int mesR = leer.nextInt();
        System.out.println("Año: ");
        int anioR = leer.nextInt();
        fechaDevolucion = LocalDate.of(anioR, mesR, diaR);
        System.out.println("--------------------------------");

        long diasAlquiler = ChronoUnit.DAYS.between(fechaAlquiler, fechaDevolucion);

        return diasAlquiler;
    }  
    
//    Para pasar de STRING A LOCAL DATE
    //public long CalculadoraDias(String fecha1, String fecha2) {
//        
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        LocalDate f1 = LocalDate.parse(fecha1, formatter);
//        
//        LocalDate f2 = LocalDate.parse(fecha2, formatter);
//        
//        long dias = ChronoUnit.DAYS.between(f1, f2);
//        
//        return dias;
//    }
}
    

