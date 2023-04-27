package UX;
import java.util.Arrays;
import java.util.ArrayList;
import datos.*;
import logica.*;

public class Interfaz{
  public static void menuPrincipal(){
	System.out.println("\n");

	for(int i = 0; i < 100; i++) {
		System.out.print("/");
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    System.out.println("\nBienvendide al (mini)SIA");
    System.out.println("1. Consultar estudiantes\n2. Consultar docentes");
    System.out.println("Puede volver al menu principal en cualquier momento ingresando el numero \"0\"");
  }

  public static void estudiante(){
    System.out.println("1. Ver lista de estudiantes");
    System.out.println("2. Ver oferta académica");
    System.out.println("3. Ver edificios y su estado");
  }
  
  public static void perfilEstudiante(Estudiante estudiante) {
	  System.out.println("\n"+estudiante.getNombre()+"\n"+estudiante.getUsuario()+"\n"+estudiante.getCarrera().getNombre());
	  System.out.println("Creditos totales: " + estudiante.getCreditosInscritos());
  }

  public static void listaEstudiantes(ArrayList<Estudiante> estudiantes){
    for (Estudiante e: estudiantes){
      System.out.println(Integer.toString(estudiantes.indexOf(e) + 1)+". "+ e.getNombre() + " - " + e.getUsuario());
    }
  }

  public static void listaClases(ArrayList<Clase> clases){ 
    for (Clase c: clases) {
    	System.out.println(Integer.toString(clases.indexOf(c) + 1)+ ". " + c.getAsignatura().getNombre()+" ("+c.getDocente().getNombre()+") - "+Integer.toString(c.getCreditos())+" creditos, "
    +c.getHorario().toString()+" en el salón "+c.getSalon().getId()+" del edificio "+c.getSalon().getEdificio().getNombre()+" ("+c.getId() +")\n");
    }
  }
  
  public static void listaFacultad(ArrayList<ProgramaCurricular> facu) {
	  for (ProgramaCurricular p: facu) {
		  System.out.println(Integer.toString(facu.indexOf(p) + 1) + ". " + p.getNombre());
	  }
  }
  
  public static void listaAsig(ArrayList<Asignatura> asignaturas) {
	  for (Asignatura a: asignaturas) {
		  System.out.println(Integer.toString(asignaturas.indexOf(a) + 1) + ". " + a.getNombre() + " - " + a.getCreditos() + " creditos");
	  }
  }
  
  public static void listaEdificios(ArrayList<Edificio> edificios) {
	  for (Edificio e: edificios) {
		  System.out.println(e.getNombre() + " " + e.getId() + " - Estado: "+(e.getEstado() ? "En funcionamiento" : "No en funcionamiento"));
	  }
	
  }
  
  public static void listaDocentes(ArrayList<Docente> docentes) {
	  for (Docente d: docentes) {
		  System.out.println(Integer.toString(docentes.indexOf(d) + 1) + ". " +d.getNombre() + " " + d.getCorreo() + " - " + d.getFacultad().getNombre());
	  }
  }
  
  public static void docente(){
    System.out.println("1. Ver lista de docentes");
    //System.out.println("2. Ver correos de contacto");
    System.out.println("");
  }

  public Interfaz(){}
}