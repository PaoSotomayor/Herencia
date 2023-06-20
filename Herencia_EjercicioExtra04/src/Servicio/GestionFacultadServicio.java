/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Empleado;
import Entidades.Estudiante;
import Entidades.GestionFacultad;
import Entidades.PersonalServicio;
import Entidades.Profesor;
import Enums.Departamento;
import Enums.Seccion;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionFacultadServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<GestionFacultad> personas = new ArrayList();
    ArrayList<GestionFacultad> empleados = new ArrayList();

    public void cargarPersonas() {

        personas.add(new Estudiante("Matemáticas", "Jose", "Pérez", "Soltero", 111111));
        personas.add(new Estudiante("Lenguas", "Luisa", "Gómez", "Soltera", 222222));
        personas.add(new Estudiante("Arquitectura", "Ana", "Rodríguez", "Casada", 333333));
        personas.add(new Estudiante("Matemáticas", "Carlos", "López", "Soltero", 444444));
        personas.add(new Estudiante("Filosofía", "Laura", "Martínez", "Casada", 555555));
        personas.add(new Estudiante("Matemáticas", "Pedro", "Hernández", "Soltero", 666666));
        personas.add(new Estudiante("Lenguas", "María", "Sánchez", "Soltera", 777777));
        personas.add(new Estudiante("Filosofía", "Juan", "González", "Casado", 888888));
        personas.add(new Estudiante("Arquitectura", "Sara", "Torres", "Soltera", 999999));
        personas.add(new Estudiante("Matemáticas", "Daniel", "Jiménez", "Soltero", 123456));

        empleados.add(new Profesor(Departamento.LENGUAJES, 2021, 333, "Federico", "Araoz", "Viudo", 999995));
        empleados.add(new Profesor(Departamento.MATEMATICAS, 2020, 444, "Miguel", "Unamuno", "Soltero", 788888));
        empleados.add(new Profesor(Departamento.CIENCIAS, 2022, 666, "Sarita", "Montiel", "Soltero", 664666));
        empleados.add(new Profesor(Departamento.QUIMICA, 2023, 777, "Liliana", "Herrera", "Viudo", 551555));
        empleados.add(new Profesor(Departamento.FILOSOFIA, 2021, 888, "Julian", "Pena", "Casado", 444444));
        empleados.add(new Profesor(Departamento.HISTORIA, 2020, 999, "Sebastián", "Opell", "Soltero", 336313));
        empleados.add(new Profesor(Departamento.CIENCIAS, 2002, 111, "Juana", "Molina", "Divorciado", 224322));
        empleados.add(new Profesor(Departamento.LENGUAJES, 2023, 222, "Sandra", "Estévez", "Casado", 123411));
        empleados.add(new Profesor(Departamento.MATEMATICAS, 2008, 444, "Pedro", "Pascal", "Soltero", 123456));

        empleados.add(new PersonalServicio(Seccion.BIBLIOTECA, 2015, 133, "Paula", "Chavez", "Casado", 224444));
        empleados.add(new PersonalServicio(Seccion.DECANATO, 2012, 299, "Juan", "García", "Soltero", 5554455));
        empleados.add(new PersonalServicio(Seccion.SECRETARIA, 2018, 398, "María", "López", "Casada", 066666));
        empleados.add(new PersonalServicio(Seccion.SECRETARIA, 2016, 444, "Pedro", "Martínez", "Soltero", 077771));
        empleados.add(new PersonalServicio(Seccion.BIBLIOTECA, 2019, 555, "Laura", "Rodríguez", "Casada", 618888));
        
     
      
        String op;
        do {
            System.out.println("""
                           ----------------------------------------------
                               Sistema de gestión de Facultad
                           ----------------------------------------------
                           A - Cambio de estado civil
                           B - Reasignación de Despacho (EMP)
                           C - Matriculación a nuevo curso (EST)
                           D - Cambio de Departamento (PROF)
                           E - Traslado de Sección (EMPL SERV)
                           F - Imprimir info de Estudiantes
                           G-  Imprimir info de Empleados(prof y serv)
                           H - Salir
                           --------------------✪✪✪✪✪--------------------
                           """);
            op = leer.next();

            switch (op.toUpperCase()) {

                case "A":
                    CambioEstadoCivil();
                    break;
                case "B":
                    ReasignarDespacho();
                    break;

                case "C":
                    MatricularNuevoCurso();

                    break;

                case "D":
                    ReasignarDepartamento();
                    break;
                case "E":
                    TrasladoSeccion();
                    break;

                case "F":
                  imprimirInfoEstudiantes(personas);
                    break;
                    case "G":
                  imprimirInfoEmpleados(empleados);
                    break;

                case "H":
                    System.out.println("""
                                       --------------------✪✪✪✪✪--------------------
                                          Gracias por utilizar nuestros servicios
                                       --------------------✪✪✪✪✪--------------------
                                       
                                       """);
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (!(op.equalsIgnoreCase("H")));
    }

    public void CambioEstadoCivil() { //A Cambio de estado civil
        
        for (GestionFacultad aux : personas) {

            System.out.println("Estudiante-> " + " DNI: " + aux.getID() +" "+ aux.getNombre() + " " + aux.getApellido() + " (" + aux.getEstadoCivil() + ") ");
        }
        for (GestionFacultad aux : empleados) {

            System.out.println("Empleado-> " + " DNI: " + aux.getID() +" " + aux.getNombre() + " " + aux.getApellido() + " (" + aux.getEstadoCivil() + ") ");
                    
        }
        System.out.println(" ");
        System.out.println("Ingrese el DNI de la persona que cambiará el estado civil. ");
        int dni = leer.nextInt();
        for (GestionFacultad aux : empleados) {

            if (aux.getID() == dni) {
                System.out.println("Ingrese el nuevo estado civil de " + aux.getNombre() + " " + aux.getApellido() );
                aux.cambioEstadoCivil(leer.next());
                System.out.println("El nuevo estado civil de " + " " + aux.getNombre() + " " + aux.getApellido() + " es: "
                        + aux.getEstadoCivil());
                break;
            }

        }
        for (GestionFacultad aux : personas) {

            if (aux.getID() == dni) {
                System.out.println("Ingrese el nuevo estado civil de " + aux.getNombre() + " " + aux.getApellido() );
                aux.cambioEstadoCivil(leer.next());
                System.out.println("El nuevo estado civil de " + " " + aux.getNombre() + " " + aux.getApellido() + " es: "
                        + aux.getEstadoCivil());
                break;
            }
        }
    }

    public void ReasignarDespacho() { //B Reasignación de Despacho (empleado)
        for (GestionFacultad aux : empleados) {
            Object empl = (Empleado) aux;
            System.out.println("Empleado-> " +" DNI: " + aux.getID() +" "+ aux.getApellido() + " Despacho Nº-> " + ((Empleado) aux).getNumDespacho());
        }
        System.out.println(" ");
        System.out.println("Ingrese el DNI del empleado para reasignar su despacho ");
        int dni = leer.nextInt();

        System.out.println(" ");
        for (GestionFacultad aux : empleados) {

            if (aux instanceof Profesor) {
                Object prof = (Profesor) aux;
                if (aux.getID() == dni) {
                    System.out.println("Ingrese el nuevo despacho de " +" "+ aux.getApellido());
                    ((Profesor) aux).reasignacionDespacho(leer.nextInt());
                    System.out.println("El nuevo Nº de despacho de  " + "-> " + aux.getNombre() + " " + aux.getApellido() + " es: "
                            + ((Profesor) aux).getNumDespacho());
                }
            }
            if (aux instanceof PersonalServicio) {
                Object perServ = (PersonalServicio) aux;
                if (aux.getID() == dni) {
                    System.out.println("Ingrese el nuevo despacho");
                    ((PersonalServicio) aux).reasignacionDespacho(leer.nextInt());
                    System.out.println("El nuevo Nº de despacho de  " + " " + aux.getNombre() + " " + aux.getApellido() + " es ->"
                            + ((PersonalServicio) aux).getNumDespacho());
                }
            }
        }

    }

    public void MatricularNuevoCurso() { //C Matriculación a nuevo curso
        for (GestionFacultad aux : personas) {
            System.out.println("Estudiante-> " + " DNI: " + aux.getID() + " "+ aux.getNombre() + " " + aux.getApellido() + " ( " + ((Estudiante) aux).getCurso() + " ) ");
                   
        }
        System.out.println(" ");
        System.out.println("Ingrese el DNI del estudiante que se matriculará a un nuevo curso ");
        int key = leer.nextInt();
        for (GestionFacultad aux : personas) {
            if (aux instanceof Estudiante) {
                Object est = (Estudiante) aux;
                if (aux.getID() == key) {
                    System.out.println("Ingrese el curso nuevo en que se matriculará " + aux.getNombre() + " " + aux.getApellido());
                    System.out.println("[\"Matematica\"/ \"Lenguas\" / \"Arquitectura\" / \"Filosofia\"]");
                    ((Estudiante) aux).MatricularseAotroCurso(leer.next());
                    System.out.println("El nuevo curso de "  + aux.getNombre() + " " + aux.getApellido() + " es: "
                            + ((Estudiante) aux).getCurso());
                }
            }
        }

    }

    public void ReasignarDepartamento() { //D Cambio de Departamento (prof)
        
        int x = 1;
        List<Profesor> profs = new ArrayList();
        for (GestionFacultad aux : empleados) {
            if (aux instanceof Profesor) {
                profs.add((Profesor) aux);
                System.out.println(x + " <- " + aux.getNombre() + " " + aux.getApellido() +"[ "+ ((Profesor) aux).getDepartamento()+"]");
                x++;
            }
        }
        System.out.println(" ");
        System.out.println("Ingrese el Nº del profesor que será reasignado: ");
        int opc = leer.nextInt() - 1;
        Profesor p = profs.get(opc);
        x = 1;
        for (Departamento aux : Departamento.values()) {
            System.out.println( x + " <- " + aux );
            x++;
        }
        System.out.println(" ");
        System.out.println("Ingrese el Nº del Departamento a asignar a: "+ p.getNombre() + " " + p.getApellido());
        opc = leer.nextInt() - 1;
        p.setDepartamento(Departamento.values()[opc]);
        System.out.println(p.getNombre() + " " + p.getApellido() + " ha sido asignad@ a: " + (Departamento.values()[opc]));
    }


    public void TrasladoSeccion() { //E Traslado de Sección (empleados de serv)

        int x = 1;
        List<PersonalServicio> perS = new ArrayList();
        for (GestionFacultad aux : empleados) {
            if (aux instanceof PersonalServicio) {
                perS.add((PersonalServicio) aux);
                System.out.println(x + " <- " + aux.getNombre() + " " + aux.getApellido() + "[ " + ((PersonalServicio) aux).getSeccion()+"]");
                x++;
            }
        }
        System.out.println("");
        System.out.println("Ingrese el Nº del miembro del Personal de Servicio para trasladar de sección: ");
        int opc = leer.nextInt() - 1;
        PersonalServicio p = perS.get(opc);
        x = 1;
        for (Seccion td : Seccion.values()) {
            System.out.println(x + " " + td);
            x++;
        }
        System.out.println("Ingrese el Nº de la nueva sección: ");
        opc = leer.nextInt() - 1;
        p.setSeccion(Seccion.values()[opc]);
        System.out.println(p.getNombre() + " " + p.getApellido() + " ha sido asignad@ a: " + (Seccion.values()[opc]));
    }

    public void imprimirInfoEstudiantes(ArrayList<GestionFacultad> personas) { 
        for (GestionFacultad persona : personas) {
            System.out.println(persona);
        }
    }
    public void imprimirInfoEmpleados(ArrayList<GestionFacultad> empleados) { 
        for (GestionFacultad persona : empleados) {
            System.out.println(persona);
        }
    }
}
