package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="productosTiendas")
public class ProductoTienda {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idProductoTienda;

    private String producto;
    private double costo;

    public ProductoTienda(String producto, double costo){
        this.producto = producto;
        this.costo = costo;
    }
    
    public ProductoTienda(){
        ;
    }

    public int getIdProductoTienda() {
        return idProductoTienda;
    }

    public void setIdProductoTienda(int idProductoTienda) {
        this.idProductoTienda = idProductoTienda;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    
}
