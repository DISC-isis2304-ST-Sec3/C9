package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="hoteles")
public class Hotel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int idHotel;
    private String nombre;
    private String ubicacion; 
    private int estrellas;

    public Hotel( String nombre, String ubicacion, int estrellas){

        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.estrellas = estrellas; 
    }
    
    public Hotel(){
        ;
    }

    public int getIdHotel() {
        return idHotel;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setIdHotel(int idHotel) {
        this.idHotel = idHotel;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    
}
