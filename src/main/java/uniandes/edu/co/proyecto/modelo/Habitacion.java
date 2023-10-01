package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="habitaciones")
public class Habitacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idHabitacion; 

    private int numeroDeHabitacion; 
    private int capacidad;
    private String tipo;
    private int costo;
    private boolean ocupado; 

    public Habitacion(int numeroDeHabitacion, int capacidad, String tipo, int costo, boolean ocupado){

        this.numeroDeHabitacion = numeroDeHabitacion;
        this.capacidad = capacidad;
        this.tipo = tipo;
        this.costo = costo;
        this.ocupado = ocupado;
    }

    public Habitacion(){
        ;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public int getNumeroDeHabitacion() {
        return numeroDeHabitacion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCosto() {
        return costo;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public void setNumeroDeHabitacion(int numeroDeHabitacion) {
        this.numeroDeHabitacion = numeroDeHabitacion;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    
}
