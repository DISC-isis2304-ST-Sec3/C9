package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="serviciosInternet")
public class ServicioInternet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idInternet;

    private int capacidad;
    private double costo;

    public ServicioInternet(int capacidad, double costo){
        this.capacidad = capacidad;
        this.costo = costo;

    }

    public ServicioInternet(){
        ;
    }

    public int getIdInternet() {
        return idInternet;
    }

    public void setIdInternet(int idInternet) {
        this.idInternet = idInternet;
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
