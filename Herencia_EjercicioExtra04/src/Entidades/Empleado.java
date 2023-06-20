package Entidades;

/*Con respecto a los empleados, sean del tipo que sean, hay que saber su año de incorporación a la facultad y qué número de despacho tienen asignado
 */
public class Empleado extends GestionFacultad {

    protected int anioIncorporacion, numDespacho;

    public Empleado() {
    }

    public Empleado(int anioIncorporacion, int numDespacho) {
        this.anioIncorporacion = anioIncorporacion;
        this.numDespacho = numDespacho;
    }

    public Empleado(int anioIncorporacion, int numDespacho, String nombre, String apellido, String estadoCivil, int ID) {
        super(nombre, apellido, estadoCivil, ID);
        this.anioIncorporacion = anioIncorporacion;
        this.numDespacho = numDespacho;
    }

    public int getAnioIncorporacion() {
        return anioIncorporacion;
    }

    public void setAnioIncorporacion(int anioIncorporacion) {
        this.anioIncorporacion = anioIncorporacion;
    }

    public int getNumDespacho() {
        return numDespacho;
    }

    public void setNumDespacho(int numDespacho) {
        this.numDespacho = numDespacho;
    }

 //• Reasignación de despacho a un empleado. 
    
    public void reasignacionDespacho(int newDespacho){
        numDespacho=newDespacho;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleados{");
        super.toString();
        sb.append("año de Incorporación=").append(anioIncorporacion);
        sb.append(", número de Despacho: ").append(numDespacho);
        sb.append('}');
        return sb.toString();
    }

}
