package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="reservas")
public class ReservaHabitacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idReservaHab;
    
    private String fechaEntrada;
    private String fechaSalida;
    private int numPersonas;

    public ReservaHabitacion(String fechaEntrada, String fechaSalida, int numPersonas){
        
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.numPersonas = numPersonas;

    }

    public ReservaHabitacion(){
        ;
    }

    public int getIdReservaHab() {
        return idReservaHab;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public int getNumPersonas() {
        return numPersonas;
    }

    public void setIdReservaHab(int idReservaHab) {
        this.idReservaHab = idReservaHab;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public void setNumPersonas(int numPersonas) {
        this.numPersonas = numPersonas;
    }

    
}
