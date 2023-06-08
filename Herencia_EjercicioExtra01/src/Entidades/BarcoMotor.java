/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author user
 */
public class BarcoMotor extends Barco {
    protected int potenciaCV;

    public BarcoMotor() {
    }

    public BarcoMotor(int potenciaCV, int matricula, double tamanio, int anioFab) {
        super(matricula, tamanio, anioFab);
        this.potenciaCV = potenciaCV;
    }
    
    @Override
    public void crearBarco(){
        super.crearBarco();
        System.out.println("Ingrese la potencia en CV: ");
        potenciaCV = leer.nextInt();
    }

    @Override
    public double modulo() {
        return super.modulo()+potenciaCV;
    }
}
    

