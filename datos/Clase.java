package datos;
import java.util.ArrayList;
import java.util.Arrays;

public class Clase{
  ArrayList<Estudiante> _listaEstudiantes = new ArrayList<Estudiante>();
  Docente _docente;
  Asignatura _asignatura;
  Salon _salon;
  int _creditosPorCurso;
  String _id;
  Horario _horario;

  public void addEstudiante(Estudiante estudiante){
    estudiante.addClase(this);
    this._listaEstudiantes.add(estudiante);
  }
  public void addEstudiante(Estudiante estudiante1, Estudiante estudiante2){
	    estudiante1.addClase(this);
	    estudiante2.addClase(this);
	    this._listaEstudiantes.add(estudiante1);
	    this._listaEstudiantes.add(estudiante2);
	  }
  public void clearEstudiantes(){
    this._listaEstudiantes.clear();
  }
  public ArrayList<Estudiante> getEstudiantes(){
    return this._listaEstudiantes;
  }
  public void setDocente(Docente docente){
	docente.addClase(this);
    this._docente = docente;
  }
  public Docente getDocente(){
    return this._docente;
  }
  public void setAsignatura(Asignatura asignatura){
    this._asignatura = asignatura;
    this._creditosPorCurso = this._asignatura.getCreditos();
  }
  public Asignatura getAsignatura(){
    return this._asignatura;
  }
  public void setSalon(Salon salon){
    this._salon = salon;
  }
  public Salon getSalon(){
    return this._salon;
  }
  public void setHorario(Horario horario){
    this._horario = horario;
  }
  public Horario getHorario(){
    return this._horario;
  }
  public void setId(String identificador){
    this._id = identificador;
  }
  public String getId(){
    return this._id;
  }
  public int getCreditos(){
    return this._creditosPorCurso;
  }
  
  @Override
  public String toString(){
    int tamano = _listaEstudiantes.size();
    String[] estudiantes = new String[tamano];
    for (int i = 0; i < tamano; i++){
      estudiantes[i] = _listaEstudiantes.get(i).getNombre();}
    
    return ("Esta es la clase identificada como "+this.getId()+" de la asignatura "+ this._asignatura.getNombre() +" con horario de "+ Integer.toString(this._horario.getHoraInicio())+" a "+Integer.toString(this._horario.getHoraFin())+" los "+this._horario.getDia()+", en el salon " + this._salon.getId() +" del "+this._salon.getEdificio().getNombre()+" que representa "+Integer.toString(this.getCreditos())+" creditos y donde estudian: "+ Arrays.toString(estudiantes));
  }

  public Clase(Asignatura asignatura, Salon salon, String id, Horario horario){
    this.setAsignatura(asignatura);
    this.setSalon(salon);
    this.setId(id);
    this.setHorario(horario);
  }
  
}