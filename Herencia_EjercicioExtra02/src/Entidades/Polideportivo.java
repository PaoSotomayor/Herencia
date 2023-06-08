/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/*Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o Abierto, esta clase implementará los dos métodos abstractos 
y los atributos del padre.
 */
public class Polideportivo extends Edificio {
    protected String nombre;
    protected boolean instalacion;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, boolean instalacion, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.instalacion = instalacion;
    }

    public boolean isInstalacion() {
        return instalacion;
    }

    public void setInstalacion(boolean instalacion) {
        this.instalacion = instalacion;
    }

    
    public Polideportivo crearPolideportivo(){
        Polideportivo poli1 = new Polideportivo();
        System.out.println("Ingrese el nombre del polideportivo");
        nombre = leer.next();
        System.out.println("El polideportivo es techado?");
        String resp = leer.next();
        if (resp.equalsIgnoreCase("Techado")) {
            instalacion = true;
        }else{
            instalacion = false;
            
        }
        System.out.println("Indique el ancho: ");
        ancho = leer.nextDouble();
        System.out.println("Indique el largo");
        largo = leer.nextDouble();
        System.out.println("Indique el alto");
        alto = leer.nextDouble();
        
        calcularSuperficie();
        calcularVolumen();
        if (instalacion) {
            System.out.println("El polideportivo es techado");
        }else{
            System.out.println("El polideportivo es abierto");
        }
        return poli1;
    }

    @Override
    public void calcularSuperficie() {
       System.out.println("La superficie es: " + largo * ancho);
    }

    @Override
    public void calcularVolumen() {
       System.out.println("El volúmen es: " + largo * ancho * alto); 
    }
    
}
