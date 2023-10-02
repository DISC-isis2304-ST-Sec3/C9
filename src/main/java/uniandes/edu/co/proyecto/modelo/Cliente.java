package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="clientes")
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int documentoC;

    private String tipoDoc;
    private String nombre;
    private String correo;
    private int reservaHabitacion;


    public Cliente(String tipoDoc, String nombre, String correo, int reservaHabitacion){
        
        this.tipoDoc = tipoDoc;
        this.nombre = nombre;
        this.correo = correo;
        this.reservaHabitacion = reservaHabitacion;

    }

    public Cliente(){
        ;
    }

    public int getDocumentoC() {
        return documentoC;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public int getReservaHabitacion() {
        return reservaHabitacion;
    }

    public void setDocumentoC(int documentoC) {
        this.documentoC = documentoC;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setReservaHabitacion(int reservaHabitacion) {
        this.reservaHabitacion = reservaHabitacion;
    }

    
}
