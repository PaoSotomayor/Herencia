
package Enums;

/*Por lo que se refiere a los profesores, es necesario gestionar a qué departamento pertenecen (lenguajes, matemáticas, arquitectura, ...).
 */
public enum Seccion {
    
    BIBLIOTECA("Biblioteca"), DECANATO("Decanato"),SECRETARIA ("Secretaria");
    private String seccion;

    private Seccion() {
    }

    private Seccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sección");
        sb.append("-> ").append(seccion);
        sb.append(' ');
        return sb.toString();
    }
    
    
    
}