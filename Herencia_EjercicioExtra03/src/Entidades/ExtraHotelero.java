/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Scanner;

/*los Alojamientos Extra hoteleros proveen servicios diferentes a los de los hoteles, estando más orientados a la vida al aire libre y al 
turista de bajos recursos. Por cada Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros cuadrados que ocupa. 
Existen dos tipos de alojamientos extrahoteleros: los Camping y las Residencias
 */
public class ExtraHotelero extends Alojamiento{
      protected Scanner leer = new Scanner(System.in);
    protected boolean privado;
    protected Integer mtrCuadrados;

    public ExtraHotelero() {
    }

    public ExtraHotelero(boolean privado, Integer mtrCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.mtrCuadrados = mtrCuadrados;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public Integer getMtrCuadrados() {
        return mtrCuadrados;
    }

    public void setMtrCuadrados(Integer mtrCuadrados) {
        this.mtrCuadrados = mtrCuadrados;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ExtraHotelero");
        sb.append("Nombre: ").append(nombre);
        sb.append(", Direccion: ").append(direccion);
        sb.append(", Localidad: ").append(localidad);
        sb.append(", Gerente a cargo : ").append(gerente);
        sb.append("Es privado?: ").append(privado);
        sb.append(", Cantidad de metros Cuadrados: ").append(mtrCuadrados);
        sb.append(' ');
        return sb.toString();
    }

    
    }
    
    

