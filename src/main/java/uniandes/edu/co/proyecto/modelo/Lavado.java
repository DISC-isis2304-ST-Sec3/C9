package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="Lavados")
public class Lavado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idLavado;

    private int cantidad;
    
    public Lavado(int cantidad){
        this.cantidad = cantidad;
    }

    public Lavado(){
        ;
    }

    public int getIdLavado() {
        return idLavado;
    }

    public void setIdLavado(int idLavado) {
        this.idLavado = idLavado;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
}
