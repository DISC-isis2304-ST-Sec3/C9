package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="planesConsumo")
public class PlanConsumo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPlanConsumo;

    public PlanConsumo(){
        ;
    }

    public int getIdPlanConsumo() {
        return idPlanConsumo;
    }

    public void setIdPlanConsumo(int idPlanConsumo) {
        this.idPlanConsumo = idPlanConsumo;
    }

    
}
