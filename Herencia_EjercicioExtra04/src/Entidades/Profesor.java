
package Entidades;

import Enums.Departamento;



/*Por lo que se refiere a los profesores, es necesario gestionar a qué departamento pertenecen (lenguajes, matemáticas, arquitectura, ...).
 */
public class Profesor extends Empleado {
    protected Departamento departamento;

    public Profesor() {
    }

    public Profesor(Departamento departamento) {
        this.departamento = departamento;
    }

    public Profesor(Departamento departamento, int anioIncorporacion, int numDespacho) {
        super(anioIncorporacion, numDespacho);
        this.departamento = departamento;
    }

    public Profesor(Departamento departamento, int anioIncorporacion, int numDespacho, String nombre, String apellido, String estadoCivil, int ID) {
        super(anioIncorporacion, numDespacho, nombre, apellido, estadoCivil, ID);
        this.departamento = departamento;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
// public void cambioDep(String newDepartamento){
//        
//        departamento=newDepartamento;
//    }
 
 

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Profesor ");
        super.toString();
        sb.append("").append(nombre);
        sb.append(" ").append(apellido);
        sb.append(" - ").append(estadoCivil);
        sb.append(" - ID: ").append(ID);
        sb.append(" ").append(departamento);
        sb.append("");
        
      
        sb.append(' ');
        return sb.toString();
    }

  
    }

