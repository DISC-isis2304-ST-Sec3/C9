package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="restaurantes")
public class Restaurante {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idRestaurante;

    private int capacidadRestaurate;
    private String estiloRes;

    public Restaurante(int capacidadRestaurate, String estiloRes){

        this.capacidadRestaurate = capacidadRestaurate;
        this.estiloRes = estiloRes;
    }

    public Restaurante(){
        ;
    }

    public int getIdRestaurante() {
        return idRestaurante;
    }

    public void setIdRestaurante(int idRestaurante) {
        this.idRestaurante = idRestaurante;
    }

    public int getCapacidadRestaurate() {
        return capacidadRestaurate;
    }

    public void setCapacidadRestaurate(int capacidadRestaurate) {
        this.capacidadRestaurate = capacidadRestaurate;
    }

    public String getEstiloRes() {
        return estiloRes;
    }

    public void setEstiloRes(String estiloRes) {
        this.estiloRes = estiloRes;
    }

    
}
