

package Entidades;

/*Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de identificación y su estado civil.
 */
public class GestionFacultad {

    String nombre;

    protected String apellido, estadoCivil;
    protected int ID;

    public GestionFacultad() {
    }

    public GestionFacultad(String nombre, String apellido, String estadoCivil, int ID) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.estadoCivil = estadoCivil;
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    //Cambio del estado civil de una persona.
    public void cambioEstadoCivil(String newEstado){
        
        estadoCivil = newEstado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GestionFacultad{");
        sb.append("nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append(", estadoCivil=").append(estadoCivil);
        sb.append(", ID=").append(ID);
        sb.append('}');
        return sb.toString();
    }
    

}
