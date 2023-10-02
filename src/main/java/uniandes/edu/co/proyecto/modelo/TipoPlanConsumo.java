package uniandes.edu.co.proyecto.modelo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="tipoPlanesConsumo")
public class TipoPlanConsumo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPlan;

    private String nombre;
    private int costo;

    public TipoPlanConsumo(String nombre, int costo){

        this.nombre = nombre;
        this.costo = costo;

    }

    public TipoPlanConsumo(){
        ;
    }

    public int getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(int idPlan) {
        this.idPlan = idPlan;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    
    
}
