package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name ="tiposTiendas")
public class TipoTienda {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idTipoTienda;
    
    private String nombre;

    public TipoTienda(String nombre){
        this.nombre = nombre;
    }

    public TipoTienda(){
        ;
    }

    public int getIdTipoTienda() {
        return idTipoTienda;
    }

    public void setIdTipoTienda(int idTipoTienda) {
        this.idTipoTienda = idTipoTienda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
