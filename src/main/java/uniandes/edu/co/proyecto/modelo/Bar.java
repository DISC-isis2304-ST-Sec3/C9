package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="bares")
public class Bar {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idBar;

    private int capacidadBar;
    private String estiloBar;

    public Bar(int capacidadBar, String estiloBar){

        this.capacidadBar = capacidadBar;
        this.estiloBar = estiloBar;
    }
    
    public Bar(){
        ;
    }

    public int getIdBar() {
        return idBar;
    }

    public void setIdBar(int idBar) {
        this.idBar = idBar;
    }

    public int getCapacidadBar() {
        return capacidadBar;
    }

    public void setCapacidadBar(int capacidadBar) {
        this.capacidadBar = capacidadBar;
    }

    public String getEstiloBar() {
        return estiloBar;
    }

    public void setEstiloBar(String estiloBar) {
        this.estiloBar = estiloBar;
    }

    
    
}
