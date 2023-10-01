package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="horariosPiscina")
public class HorarioPiscina {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idHorarioPiscina;

    private String horarioInicioP;
    private String horarioFinP;

    public HorarioPiscina(String horarioInicioP, String horarioFinP){

        this.horarioInicioP = horarioInicioP;
        this.horarioFinP = horarioFinP;

    }

    public HorarioPiscina(){
        ;
    }

    public int getIdHorarioPiscina() {
        return idHorarioPiscina;
    }

    public void setIdHorarioPiscina(int idHorarioPiscina) {
        this.idHorarioPiscina = idHorarioPiscina;
    }

    public String getHorarioInicioP() {
        return horarioInicioP;
    }

    public void setHorarioInicioP(String horarioInicioP) {
        this.horarioInicioP = horarioInicioP;
    }

    public String getHorarioFinP() {
        return horarioFinP;
    }

    public void setHorarioFinP(String horarioFinP) {
        this.horarioFinP = horarioFinP;
    }

    

    
}
