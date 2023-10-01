package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="productosBares")
public class ProductoBar {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idProductoBar;

    private String producto;
    private double costo;

    public ProductoBar(String producto, double costo){
        this.producto = producto; 
        this.costo = costo;
    }

    public ProductoBar(){
        ;
    }

    public int getIdProductoBar() {
        return idProductoBar;
    }

    public void setIdProductoBar(int idProductoBar) {
        this.idProductoBar = idProductoBar;
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

