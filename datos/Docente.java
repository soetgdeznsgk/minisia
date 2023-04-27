package datos;
import java.util.ArrayList;

public class Docente {
  String _nombreDocente, _correoDocente;
  ProgramaCurricular _perteneceAFac;
  ArrayList<Clase> _clases = new ArrayList<Clase>();

  public void addClase(Clase clase) {
	  this._clases.add(clase);
  }
  public ArrayList<Clase> getClases(){
	  return this._clases;
  }
  public void setNombre(String nombre){
    this._nombreDocente = nombre;
  }
  public String getNombre(){
    return this._nombreDocente;
  }
  public void setCorreo(String correo){
    this._correoDocente = correo;
  }
  public String getCorreo(){
    return this._correoDocente;
  }
  public void setFacultad(ProgramaCurricular facu){
    this._perteneceAFac = facu;
  }
  public ProgramaCurricular getFacultad(){
    return this._perteneceAFac;
  }
  @Override
  public String toString(){
    return("Soy el docente "+this._nombreDocente+", de correo "+_correoDocente+"y perteneciente a la facultad de "+ this._perteneceAFac.getNombre());
  }

  public Docente(String nombre, String correo, ProgramaCurricular facu){
    this.setNombre(nombre);
    this.setCorreo(correo);
    this.setFacultad(facu);
  }

  public Docente(String nombre, ProgramaCurricular facu){
    this.setNombre(nombre);
    this.setFacultad(facu);
  }
}