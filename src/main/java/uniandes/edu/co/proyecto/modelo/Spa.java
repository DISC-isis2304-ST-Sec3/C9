package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="spas")
public class Spa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idSpa;

    private String horaInicio;
    private String duracion;
    private int capacidad;
    private double costo;

    public Spa(String horaInicio, String duracion, int capacidad, double costo){
        this.horaInicio = horaInicio;
        this.duracion = duracion;
        this.capacidad = capacidad;
        this.costo = costo;

    }

    public Spa(){
        ;
    }

    public int getIdSpa() {
        return idSpa;
    }

    public void setIdSpa(int idSpa) {
        this.idSpa = idSpa;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    

    
}
