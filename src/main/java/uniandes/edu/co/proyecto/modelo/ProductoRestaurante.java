package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="productosRestaurantes")
public class ProductoRestaurante {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idProductoRes;

    private String producto;
    private double costo;

    public ProductoRestaurante(String producto, double costo){
        this.producto = producto;
        this.costo = costo;
    }

    public ProductoRestaurante(){
        ;
    }

    public int getIdProductoRes() {
        return idProductoRes;
    }

    public void setIdProductoRes(int idProductoRes) {
        this.idProductoRes = idProductoRes;
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
