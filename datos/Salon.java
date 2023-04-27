package datos;
public class Salon{
  public Edificio _delEdificio;
  public String _id;

  public void setEdificio(Edificio edificio){ // TESTEAR
      this._delEdificio = edificio;
  }

  public Edificio getEdificio(){
    return this._delEdificio;
  }

  public void setId(String identificador){
    this._id = identificador;
  }

  public String getId(){
    return this._id;
  }

  @Override

  public String toString(){
    return ("Este es el salon "+this.getId()+" del edificio "+this.getEdificio().getNombre());
  }

  public Salon(Edificio edificio, String identificador){
    this.setId(identificador);
    this.setEdificio(edificio);
  }
}