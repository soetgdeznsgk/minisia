package logica;
import java.util.ArrayList;
import datos.*;
import UX.Interfaz;
import java.util.Scanner;


class Main{
  
  public static void main(String[] args){
    ArrayList<Estudiante> Estudiantes= new ArrayList<Estudiante>();
    ArrayList<ProgramaCurricular> Carreras = new  ArrayList<ProgramaCurricular>(); 
    // indices carreras: 0-Ing. Sistemas, 1-Matematicas, 2-Economia, 3-Sociologia
    ArrayList<Docente> Docentes = new ArrayList<Docente>();
    ArrayList<Edificio> Edificios = new ArrayList<Edificio>();

    

    // Asignaturas
    Asignatura POO = new Asignatura("Programacion Orientada a Objetos", 3, "11");
    Asignatura ALineal = new Asignatura("Algebra Lineal", 4, "12");
    Asignatura PSistem = new Asignatura("Pensamiento Sistemico", 4, "13");
    Asignatura TyS = new Asignatura("Tecnología y Sociedad", 3, "21");
    Asignatura Migracion = new Asignatura("Migracion", 3, "22");
    Asignatura MWeber = new Asignatura("Teoria Sociologica: Max Weber", 2, "23");
    Asignatura SRural = new Asignatura("Sociologia Rural", 4, "24");
    Asignatura Macroec = new Asignatura("Macroeconomia", 4, "31");

    ProgramaCurricular IngSistemas = new ProgramaCurricular("Ingenieria de Sistemas");
    
    // indices materias Sistemas: 0-POO, 1-ALineal, 2-PSistemico
    IngSistemas.addToOferta(POO);  
    IngSistemas.addToOferta(ALineal);
    IngSistemas.addToOferta(PSistem);
    
    Carreras.add(IngSistemas);
    

    ProgramaCurricular Mates = new ProgramaCurricular("Matematicas");
  
    // indice materias Matematicas: 0-ALineal
    Mates.addToOferta(Carreras.get(0).getOferta().get(1));
    Carreras.add(Mates);

    ProgramaCurricular Econ = new ProgramaCurricular("Economia");
    
    // indices materias econ: 0- MEsta
    Econ.addToOferta(Macroec);
    
    Carreras.add(Econ);

    ProgramaCurricular Sociol = new ProgramaCurricular("Sociologia");
    
    // indices materias Sociología: 0- TyS
    Sociol.addToOferta(TyS);
    Sociol.addToOferta(SRural);
    Sociol.addToOferta(MWeber);
    Sociol.addToOferta(Migracion);
    
    Carreras.add(Sociol);
  //

    // Estudiantes 0: Emiliano, 1: Ruperto, 2: Manuel, 3: FONSI, 4: Arturo, 5: Juni
    Estudiantes.add(new Estudiante("Emiliano Guerra", "eguerra"));
    Estudiantes.get(0).setCarrera(Carreras.get(0));
    Estudiantes.add(new Estudiante("Ruperto Bonachon", "rbonachon"));
    Estudiantes.get(1).setCarrera(Carreras.get(1));
    Estudiantes.add(new Estudiante("Manuel Quintana", "mquintana"));
    Estudiantes.get(2).setCarrera(Carreras.get(0));
    Estudiantes.add(new Estudiante("Luis Fonsi", "lfonsi"));
    Estudiantes.get(3).setCarrera(Carreras.get(2));
    Estudiantes.add(new Estudiante("Arturo Bravo", "abravo"));
    Estudiantes.get(4).setCarrera(Carreras.get(3));
    Estudiantes.add(new Estudiante("Juan Nicolas Olviero", "jnoliv"));
    Estudiantes.get(5).setCarrera(Carreras.get(1));
    Estudiantes.add(new Estudiante("Natalia Munoz", "namunoz"));
    Estudiantes.get(6).setCarrera(Carreras.get(2));
    
    


    // Docentes 0: Zulima, 1: Alexei, 2: Martha, 3: Beethoven, 4: Nubia
    Docentes.add(new Docente("Zulima Bayona", "zbay@unal.edu.co", Carreras.get(1)));

    Docentes.add(new Docente("Alexei Ochoa", "aochoa@unal.edu.co", Carreras.get(0)));
    
    Docentes.add(new Docente("Martha Mancera", "mmancera@unal.edu.co", Carreras.get(1)));
    
    Docentes.add(new Docente("Beethoven Herrera", "bherr@unal.edu.co", Carreras.get(2)));
    
    Docentes.add(new Docente("Nubia Ruiz", "nruiz@unal.edu.co", Carreras.get(3)));

    // Edificios y salones

    Edificio Julio_Garavito = new Edificio("Julio Garavito", "401");
    Edificios.add(Julio_Garavito);
    Edificio Aulas_Ing = new Edificio("Aulas de Ingeniería", "453");
    Edificios.add(Aulas_Ing);
    Edificio FEM = new Edificio("Edificio Yu Takeuchi", "404", false);
    Edificios.add(FEM);
    Edificio Socio = new Edificio("Edificio Fals Borda", "205");
    Edificios.add(Socio);
    Edificio CEcon = new Edificio("Ciencias Economicas", "310");
    Edificios.add(CEcon);
    Salon s401_101 = new Salon(Julio_Garavito, "101");
    Salon s453_202 = new Salon(Aulas_Ing, "202");
    Salon s205_101 = new Salon(Socio, "101");
    Salon s404_201 = new Salon(FEM, "201");
    Salon s310_101 = new Salon(CEcon, "101");

    // Clases
    Clase aLineal9a11L = new Clase(ALineal, s401_101, "12_911_1", new Horario(1, 9, 11));
    Clase aLineal13a15Mi = new Clase(ALineal, s404_201, "12_1315_1", new Horario(3, 13, 15));
    Clase poo7a9M = new Clase(POO, s453_202, "11_79_1", new Horario(2, 7, 9));
    Clase tys17a19J = new Clase(TyS, s205_101, "21_1719_1", new Horario(4, 17, 19));
    Clase macro9a11L = new Clase(Macroec, s310_101, "31_911_1", new Horario(1, 9, 11));
    Clase macro13a15L = new Clase(Macroec, s310_101, "31_1315_1", new Horario(1, 13, 15));

    
    ALineal.addClase(aLineal9a11L);
    aLineal9a11L.setDocente(Docentes.get(0));
    aLineal9a11L.addEstudiante(Estudiantes.get(0), Estudiantes.get(2)); // agg emiliano y manuel
    ALineal.addClase(aLineal13a15Mi);
    aLineal13a15Mi.setDocente(Docentes.get(2));
    aLineal13a15Mi.addEstudiante(Estudiantes.get(5)); // agg juni
    
    POO.addClase(poo7a9M);
    poo7a9M.setDocente(Docentes.get(1));
    poo7a9M.addEstudiante(Estudiantes.get(0), Estudiantes.get(2)); // agg emiliano y manuel
    
    TyS.addClase(tys17a19J);
    tys17a19J.setDocente(Docentes.get(4));
    tys17a19J.addEstudiante(Estudiantes.get(6), Estudiantes.get(4)); // arturo y natalia
    
    Macroec.addClase(macro9a11L);
    macro9a11L.setDocente(Docentes.get(3));
    macro9a11L.addEstudiante(Estudiantes.get(6), Estudiantes.get(3)); // natalia y fonsi
    Macroec.addClase(macro13a15L);
    macro13a15L.setDocente(Docentes.get(3));
    macro13a15L.addEstudiante(Estudiantes.get(2));
    
    
    
    
    
    //System.out.println(Estudiantes.get(0).toString());
    //System.out.println(Estudiantes.get(1).toString());
    //System.out.println(aLineal9a11L.toString());
    
    
    // main

    
    Scanner sc = new Scanner(System.in);
    while (true){
      
      
      Interfaz.menuPrincipal();
      int opcionMenuPrincipal = sc.nextInt();
      int opcionMenuSecundario, opcionMenuTerciario, opcionMenuCuarto;
      Estudiante seleccionEst;
      //Docente seleccionDoc;
      
      switch (opcionMenuPrincipal){
        case 0:
          continue;
        case 1:
          Interfaz.estudiante();
          opcionMenuSecundario = sc.nextInt();
          switch(opcionMenuSecundario){
            case 0:
              continue;
            case 1:
              System.out.println("Ingrese el indice de unx estudiante para mas detalles");
              
              Interfaz.listaEstudiantes(Estudiantes);
              opcionMenuTerciario = sc.nextInt();
              if (opcionMenuTerciario > 0 && opcionMenuTerciario <= Estudiantes.size()) {
            	  seleccionEst = Estudiantes.get(opcionMenuTerciario - 1);
                  Interfaz.perfilEstudiante(seleccionEst);
                  Interfaz.listaClases(seleccionEst.getClases());}
              else {
            	  continue;}
              System.out.println("Para cancelar una materia ingrese su índice");
              
              opcionMenuCuarto = sc.nextInt();
              if (opcionMenuCuarto > 0 && opcionMenuCuarto <= seleccionEst.getClases().size()) {
            	  seleccionEst.borrarClase(seleccionEst.getClases().get(opcionMenuCuarto - 1));
            	  Interfaz.listaClases(seleccionEst.getClases());}
              break;
              
            case 2:
            	System.out.println("Cuál oferta busca?");
            	
            	Interfaz.listaFacultad(Carreras);
            	opcionMenuTerciario = sc.nextInt();
            	if (opcionMenuTerciario > 0 && opcionMenuTerciario <= Carreras.size()) {
            		Interfaz.listaAsig(Carreras.get(opcionMenuTerciario - 1).getOferta());}
            	else {
            		continue;}
            	
            	System.out.println("Para navegar los cursos activos de cada asignautra, ingrese su indice");
            	
            	opcionMenuCuarto = sc.nextInt();
            	 if (opcionMenuCuarto > 0 && opcionMenuCuarto <= Carreras.get(opcionMenuTerciario - 1).getOferta().size())
            	Interfaz.listaClases(Carreras.get(opcionMenuTerciario - 1).getOferta().get(opcionMenuCuarto - 1).getClases());
            	break;
            	
            case 3:
            	Interfaz.listaEdificios(Edificios);
            	break;
          }

          break;
        case 2:
          Interfaz.docente();
          
          opcionMenuSecundario = sc.nextInt();
          switch (opcionMenuSecundario) {
          case 1:
        	  Interfaz.listaDocentes(Docentes);
        	  System.out.println("Seleccione a un/a docente para ver los cursos en los que trabaja actualmente usando el indice");
        	  opcionMenuTerciario = sc.nextInt();
        	  if (opcionMenuTerciario > 0 && opcionMenuTerciario <= Docentes.size()){
        		  Interfaz.listaClases(Docentes.get(opcionMenuTerciario - 1).getClases());
        	  }
        	  break;     
        	  
        // faltan opciones para docentes
          }
          break;
      }   
      
      try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }  
  }
}