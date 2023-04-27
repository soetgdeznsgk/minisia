package datos;
import java.util.ArrayList;

public class Horario{
  String _dia;
  int _horaInicio, _horaFin;
  
  String[] semana = {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo", "null"};

  public void setDia(String dia){
    dia = dia.toLowerCase();
    String [] diaSplit = dia.split("");
    int largo = dia.length() - 1;
    
    for(String d: semana){
      int conteo = 0;
      String [] dSplit = d.split("");
      
      for(int i = 0; i < largo;i++){
        if (dSplit[i] == diaSplit[i]){
          conteo++;}}

      if (conteo == largo){
        this._dia = d;
        return;}
      }
    this._dia = semana[7]; // no funciona
  }

  public void setDia(int dia){
    if (dia <= 7 && 1 <= dia){
      this._dia = semana[dia - 1];
    }
    else{
      this._dia = semana[7];
    }
  }

  public String getDia(){
    return this._dia;
  }


  
  public int getHoraInicio(){
    return this._horaInicio;
  }
  
  public void setHoraInicio(int hora){    
    if (7 <= hora && hora <= 18){
      this._horaInicio = hora;
    }
  }

  public int getHoraFin(){
    return this._horaFin;
  }
  
  public void setHoraFin(int hora){    
    if (9 <= hora && hora <= 20){
      this._horaFin = hora;
    }
  }


  @Override

  public String toString(){
    return ("Clase de "+Integer.toString(this.getHoraInicio())+" a "+Integer.toString(this.getHoraFin())+" el dia "+this.getDia());
  }

  public Horario(String dia, int horaInicio, int horaFin){
    this.setDia(dia);
    this.setHoraInicio(horaInicio);
    this.setHoraFin(horaFin);
  }

  public Horario(int dia, int horaInicio, int horaFin){
    this.setDia(dia);
    this.setHoraInicio(horaInicio);
    this.setHoraFin(horaFin);
  }
}