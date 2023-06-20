package Enums;

/**
 *
 * @author user
 */
public enum Departamento {
    LENGUAJES("Lenguajes"), MATEMATICAS("Matemáticas"), FILOSOFIA("Filosofía"), 
    HISTORIA("Historia"), CIENCIAS("Ciencias"), QUIMICA("Química");
    private String departamento;

    private Departamento() {
    }

    private Departamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
     public void cambioDep(String newDepartamento){
        
        departamento=newDepartamento;
    }
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Departamento");
        sb.append("-> ").append(departamento);
        sb.append(' ');
        return sb.toString();
    }
    

}
