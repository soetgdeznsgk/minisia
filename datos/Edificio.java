package datos;
import java.util.ArrayList;

public class Edificio{
  public String _nombre;
  public String _id;
  public boolean _enFuncionamiento;
  //public ArrayList<Salon> _salones /*= new ArrayList<Salon>()*/;

  public void setNombre(String nombre){
    this._nombre = nombre;
  }
  public String getNombre(){
    return this._nombre;
  }
  public void setId(String identificador){
    this._id = identificador;
  }
  public String getId(){
    return this._id;
  }
  public void setEstado(boolean estado){
    this._enFuncionamiento = estado;
  }
  public boolean getEstado(){
    return this._enFuncionamiento;
  }
  @Override
  public String toString(){
    return ("Este es el edificio "+this.getNombre()+" identificado como Edificio "+this.getId()+", ¿Estoy actualmente en funcionamiento?: "+String.valueOf(_enFuncionamiento));
  }
  public Edificio(String nombre, String id, boolean funcionamiento){
    this.setNombre(nombre);
    this.setId(id);
    this.setEstado(funcionamiento);
  }
  public Edificio(String nombre, String id){
    this.setNombre(nombre);
    this.setId(id);
    this.setEstado(true);
  }
}