package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="servicios")
public class Servicio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idServicio;

    private String nombre;


    public Servicio(String nombre){
        this.nombre = nombre;
    }

    public Servicio(){
        ;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

}
