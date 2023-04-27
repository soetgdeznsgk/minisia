package datos;
import java.util.ArrayList;
import java.util.Iterator;

public class Estudiante {
  public String _nombre, _usuario;
  public int _creditosInscritos;
  public ArrayList<Clase> _clases = new ArrayList<Clase>();
  public ProgramaCurricular _carrera;

  public void setNombre(String nombre){
    this._nombre = nombre;}
  
  public String getNombre(){
    return this._nombre;}
  
  public void setUsuario(String usuario){
    this._usuario = usuario;}
  
  public String getUsuario(){
    return this._usuario;}

  
  public void setCarrera(ProgramaCurricular carrera){
    this._carrera = carrera;}
  
  public ProgramaCurricular getCarrera(){
    if (this._carrera != null){
      return this._carrera;}
    else{
      return new ProgramaCurricular("Nulo");}}
  
  public void addClase(Clase clase){
    this._clases.add(clase);
    this.setCreditosInscritos();}
  
  public void clrClases() { // borrar TODAS las clases del estudiante
    this._clases.clear();} 
  
  public void borrarClase(String codigoClase){ // borrar clase específica del estudiante
    int cantidadClases = this._clases.size();
    for(int i = 0; i < cantidadClases; i++){
       if (_clases.get(i).getId() == codigoClase){
         this._clases.remove(i);
         break;
       } 
    } // no usa iterador por que se necesita alterar directamente el ArrayList de clases
  }
  
  public void borrarClase(Clase clase) {
	  this._clases.remove(clase);
  }

  public ArrayList<Clase> getClases(){
    return this._clases;
  }
  
  public void setCreditosInscritos(){ // no toma parámetros, calcula los creditos en base a las clases inscrita
    this._creditosInscritos = 0;
    //int cantidadClases = this._clases.size();
    Iterator<Clase> iterador = this._clases.iterator();
    
    /*for(int i; i < cantidadClases; i++){
      this._creditosInscritos += iterador.next().getCreditos();
    }*/
    while(iterador.hasNext()){
      this._creditosInscritos += iterador.next().getCreditos();
    }}

  public int getCreditosInscritos(){
    return this._creditosInscritos;}  

  public Estudiante(String nombre, String usuario, ProgramaCurricular carrera){
    this.setNombre(nombre);
    this.setUsuario(usuario);
    this.setCarrera(carrera);
  }
  public Estudiante(String nombre, String usuario){
    this.setNombre(nombre);  
    this.setUsuario(usuario);
  }

  @Override
  public String toString(){
    return ("Hola, mi nombre es "+this._nombre+", mi usuario es "+this._usuario+", actualmente soy estudiante del programa de "+this._carrera.getNombre()+" y actualmente veo las materias "+this._clases.toString()+" que representan "+Integer.toString(this._creditosInscritos)+" creditos");
  }
  
  
}