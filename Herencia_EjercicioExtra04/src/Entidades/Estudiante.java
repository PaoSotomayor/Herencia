package Entidades;



/*En cuanto a los estudiantes, se requiere almacenar el curso en el que están matriculados
 */
public class Estudiante extends GestionFacultad {
 

    protected String curso;

    public Estudiante() {
    }

    public Estudiante(String curso) {
        this.curso = curso;
    }

    public Estudiante(String curso, String nombre, String apellido, String estadoCivil, int ID) {
        super(nombre, apellido, estadoCivil, ID);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = "Matematica"+ "Lengua" + "Arquitectura" + "Filosofia";
    }

   //• Matriculación de un estudiante en un nuevo curso. 
    public void MatricularseAotroCurso(String newCurso){
        
        curso=newCurso;
    }    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" ");
        super.toString();
        sb.append(" ");
        sb.append("").append(nombre);
        sb.append(" ").append(apellido);
        sb.append(" -  ").append(estadoCivil);
        sb.append(" ID: ").append(ID);
        sb.append(' ');
        sb.append("-> ").append(curso);
        sb.append(' ');
        return sb.toString();
    }

}
