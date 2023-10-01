package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="piscinas")
public class Piscina {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPiscina;

    public Piscina(){
        ;
    }

    public int getIdPiscina() {
        return idPiscina;
    }

    public void setIdPiscina(int idPiscina) {
        this.idPiscina = idPiscina;
    }

    
    
}
