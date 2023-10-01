package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="tiposPrendas")
public class TipoPrenda {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idTipo;

    private double costo;

    public TipoPrenda(double costo){
        this.costo = costo;
    }

    public TipoPrenda(){
        ;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    
    
}
