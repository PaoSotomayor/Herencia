/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author user
 */
public class Velero extends Barco {
    protected int numMastil;

    public Velero() {
    }

    public Velero(int numMastil, int matricula, double tamanio, int anioFab) {
        super(matricula, tamanio, anioFab);
        this.numMastil = numMastil;
    }
    
    @Override
    public void crearBarco(){
        super.crearBarco();
        System.out.println("Ingrese la cantidad de mastiles: ");
        numMastil = leer.nextInt();
    }
    
    @Override
    public double modulo() {
        return super.modulo()+numMastil;
    }    
}
    

