/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Enums.Seccion;

/**
 *
 * @author user
 */
public class PersonalServicio extends Empleado {
  protected Seccion seccion;

    public PersonalServicio() {
    }

    public PersonalServicio(Seccion seccion) {
        this.seccion = seccion;
    }

    public PersonalServicio(Seccion seccion, int anioIncorporacion, int numDespacho) {
        super(anioIncorporacion, numDespacho);
        this.seccion = seccion;
    }

    public PersonalServicio(Seccion seccion, int anioIncorporacion, int numDespacho, String nombre, String apellido, String estadoCivil, int ID) {
        super(anioIncorporacion, numDespacho, nombre, apellido, estadoCivil, ID);
        this.seccion = seccion;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }

 
   
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Personal de Servicio");
        super.toString();
        sb.append(" ");
        sb.append("").append(nombre);
        sb.append(" ").append(apellido);
        sb.append(" -").append(estadoCivil);
        sb.append(" - ID: ").append(ID);
       
        sb.append(" ").append(seccion);
        sb.append(' ');
        return sb.toString();
    }
    

    }
    
  
