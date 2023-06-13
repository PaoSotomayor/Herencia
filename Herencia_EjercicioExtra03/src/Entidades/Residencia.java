/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/*Para las residencias se indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no campo deportivo
 */
public class Residencia extends ExtraHotelero{
    protected int cantHabitaciones;
    protected boolean descGremios,camDeporte;

    public Residencia() {
    }


    public Residencia(int cantHabitaciones, boolean descGremios, boolean camDeporte, boolean privado, Integer mtrCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(privado, mtrCuadrados, nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.descGremios = descGremios;
        this.camDeporte = camDeporte;
    }

 

    public boolean isDescGremios() {
        return descGremios;
    }
    
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RESIDENCIA ✰ ");
        sb.append("Nombre: ").append(nombre);
        sb.append(", Direccion: ").append(direccion);
        sb.append(", Localidad: ").append(localidad);
        sb.append(", Gerente a cargo : ").append(gerente);
        sb.append(", Es privado?: ").append(privado);
        sb.append(", Cantidad de metros Cuadrados: ").append(mtrCuadrados);
        sb.append(", Cantidad de Habitaciones: ").append(cantHabitaciones);
        sb.append(", Tiene desuento por Gremios: ").append(descGremios);
        sb.append(", Tiene campo Deportivo: ").append(camDeporte);
        sb.append(' ');
        return sb.toString();
    }

 
    
    
}
