/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/*Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños disponibles y si posee o no un restaurante dentro de las 
instalaciones
 */
public class Camping extends ExtraHotelero {

    protected Integer maxCarpas, cantBanios;
    protected boolean Restaurante;

    public Camping() {
    }

    public Camping(Integer maxCarpas, Integer cantBanios, boolean Restaurante, boolean privado, Integer mtrCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(privado, mtrCuadrados, nombre, direccion, localidad, gerente);
        this.maxCarpas = maxCarpas;
        this.cantBanios = cantBanios;
        this.Restaurante = Restaurante;
    }

    public boolean isRestaurante() {
        return Restaurante;
    }

    public void setRestaurante(boolean Restaurante) {
        this.Restaurante = Restaurante;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CAMPING ✵ ");
        sb.append("Nombre: ").append(nombre);
        sb.append(", Direccion: ").append(direccion);
        sb.append(", Localidad: ").append(localidad);
        sb.append(", Gerente a cargo : ").append(gerente);
        sb.append(", Es privado?: ").append(privado);
        sb.append(", Cantidad de metros Cuadrados: ").append(mtrCuadrados);
        sb.append(", Capacidad máxima de carpas: ").append(maxCarpas);
        sb.append(", Cantidad de baños disponibles: ").append(cantBanios);
        sb.append(", Restaurante: ").append(Restaurante);
        sb.append(' ');
        return sb.toString();
    }

}
