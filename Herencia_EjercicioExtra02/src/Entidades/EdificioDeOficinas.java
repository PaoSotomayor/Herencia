/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/*Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas por oficina y número de pisos. Esta clase 
implementará los dos métodos abstractos y los atributos del padre.
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el usuario dirá cuántas personas 
entran en cada oficina, cuantas oficinas y el número de piso (suponiendo que en cada piso hay una oficina). 
Crear el método cantPersonas(), que muestre cuantas personas entrarían en un piso y cuantas en todo el edificio.
 */
public class EdificioDeOficinas extends Edificio {

    protected int oficinas;
    protected int personas;
    protected int numeroPisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int oficinas, int personas, int numeroPisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.oficinas = oficinas;
        this.personas = personas;
        this.numeroPisos = numeroPisos;
    }
    public EdificioDeOficinas crearEdificioDeOficinas(){
        EdificioDeOficinas ofi1 = new EdificioDeOficinas();
        System.out.println("Indique el número de oficinas hay por piso");
        oficinas = leer.nextInt();
        
        System.out.println("Indique cuantas personas hay por oficina: ");
        personas = leer.nextInt();
        
        System.out.println("Indique el numero de pisos: ");
        numeroPisos = leer.nextInt();
        
        System.out.println("Indique el ancho: ");
        ancho = leer.nextDouble();
        System.out.println("Indique el largo");
        largo = leer.nextDouble();
        System.out.println("Indique el alto");
        alto = leer.nextDouble();
        
        calcularSuperficie();
        calcularVolumen();
        cantPersonas(); 
                return ofi1;
    }

    public void cantPersonas() {

        System.out.println("Ingrese la cantidad de personas que pueden entrar en cada oficina");
        personas = leer.nextInt();
        System.out.println("Ingrese la cantidad de oficinas");
        oficinas = leer.nextInt();
//        System.out.println("Ingrese la cantidad de pisos que tiene el edificio");
//        numeroPisos = leer.nextInt();
//        System.out.println("La cantidad de personas por piso es: " + personas * oficinas);
//        System.out.println("La cantidad de personas en el edificio es " + personas * oficinas * numeroPisos);

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
