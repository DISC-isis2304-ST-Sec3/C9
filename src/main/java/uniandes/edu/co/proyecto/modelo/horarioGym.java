package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="horariosGym")
public class horarioGym {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idHorarioGym;

    private int horaInicio;
    private int horaFin; 
   
   public horarioGym(int horaInicio, int horaFin){

    this.horaInicio = horaInicio;
    this.horaFin = horaFin;
   }

   public horarioGym(){
    ;
   }

public int getIdHorarioGym() {
    return idHorarioGym;
}

public void setIdHorarioGym(int idHorarioGym) {
    this.idHorarioGym = idHorarioGym;
}

public int getHoraInicio() {
    return horaInicio;
}

public void setHoraInicio(int horaInicio) {
    this.horaInicio = horaInicio;
}

public int getHoraFin() {
    return horaFin;
}

public void setHoraFin(int horaFin) {
    this.horaFin = horaFin;
}

   
}
