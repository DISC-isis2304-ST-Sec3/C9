package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="reservasServicios")
public class ReservaServicio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idReserva;

    public ReservaServicio(){
        ;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    


}
