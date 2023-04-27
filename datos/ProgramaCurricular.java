package datos;
import java.util.ArrayList;
import java.util.Iterator;

public class ProgramaCurricular{
  String _nombreCarrera;
  ArrayList<Asignatura> _ofertaAcademica = new ArrayList<Asignatura>();
  ArrayList<Docente> _listaDocentes = new ArrayList<Docente>();
  ArrayList<Estudiante> _listaEstudiantes = new ArrayList<Estudiante>();
  int _creditosTotales = 0;

  public void setCreditos(){ // no toma parámetros, lo calcula desde la cantidad de Asignaturas
    this._creditosTotales = 0;
    Iterator<Asignatura> iterador = _ofertaAcademica.iterator();
    while(iterador.hasNext()){
      this._creditosTotales += iterador.next().getCreditos();
    }
  }

  public int getCreditos(){
    return this._creditosTotales;
  }

  public void setNombre(String nombre){
    this._nombreCarrera = nombre;
  }

  public String getNombre(){
    return this._nombreCarrera;
  }

  public ArrayList<Asignatura> getOferta(){
    return this._ofertaAcademica;
  }

  public void addToOferta(Asignatura asignatura){
    this._ofertaAcademica.add(asignatura);
  }

  public void rmFromOferta(String identificador){
    for(Asignatura a : this._ofertaAcademica){
      if (a.getId() == identificador){
        this._ofertaAcademica.remove(a);
        break;
      }
    }
  }

  public void rmFromOferta(Asignatura a){
    this._ofertaAcademica.remove(a);
  }

  public void clearOferta(){
    this._ofertaAcademica.clear();
  }

  public ArrayList<Docente> getDocentes(){
    return this._listaDocentes;
  }

  public void addDocente(Docente docente){
    this._listaDocentes.add(docente);
  }

  public void rmDocente(String nombre){ // se tiene que escribir exactamente igual el nombre, puede no ser práctico, añadir sobrecarga con un id de estudiante?
    for(Docente d: _listaDocentes){
      if (nombre == d.getNombre()){
        this._listaDocentes.remove(d);
        break;
      }
    }

  }

  public void rmDocente(Docente docente){
    this._listaDocentes.remove(docente);
  }

  public void clearDocentes(){
    this._listaDocentes.clear();
  }

  public ArrayList<Estudiante> getEstudiantes(){
    return this._listaEstudiantes;
  }
  public void addEstudiante(Estudiante estudiante){
    this._listaEstudiantes.add(estudiante);
  }
  public void rmEstudiante(String nombre){
    this._listaEstudiantes.removeIf(e -> (e.getNombre() == nombre)); 
  }

  public void rmEstudiante(Estudiante estudiante) {
    this._listaEstudiantes.remove(estudiante);
  }

  public void clearEstudiantes(){
    this._listaEstudiantes.clear();
  }

  @Override

  public String toString(){
    return("El programa curricular "+this._nombreCarrera+" oferta las asignaturas "+this._ofertaAcademica.toString()+", tiene como docentes a "+this._listaDocentes.toString()+" y como estudiantes a"+this._listaEstudiantes.toString());
  }
  
  public ProgramaCurricular(String nombreCarrera){
    this._nombreCarrera = nombreCarrera;
  }
}