package datos;
import java.util.ArrayList;

public class Asignatura{
  String _nombreAsignatura, _id;
  int _creditosPorAsignatura;
  ArrayList<Clase> _clases = new ArrayList<Clase>();

  public void addClase(Clase clase) {
	  this._clases.add(clase);
  }
  
  public ArrayList<Clase> getClases(){
	  return this._clases;
  }

  public String getId(){
    return this._id;
  }

  public void setId(String identificador){
    this._id = identificador;
  } 
  
  public String getNombre(){
    return this._nombreAsignatura;
  }

  public void setNombre(String nombre){
    this._nombreAsignatura = nombre;
  }

  public int getCreditos(){
    return this._creditosPorAsignatura;
  }

  public void setCreditos(int creditos){
    this._creditosPorAsignatura = creditos;
  }

  @Override
  public String toString(){
    return("La asignatura "+this._nombreAsignatura+" tiene "+Integer.toString(this._creditosPorAsignatura)+" creditos");
  }

  public Asignatura(String nombre, int creditos, String id){
    this.setNombre(nombre);
    this.setCreditos(creditos);
    this.setId(id);
  }
  public Asignatura(String nombre, int creditos){
    this.setNombre(nombre);
    this.setCreditos(creditos);
  }

  public Asignatura(String nombre){
    this.setNombre(nombre);
    this.setCreditos(0);
  }

  
}