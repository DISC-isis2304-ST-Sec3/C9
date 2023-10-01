package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="recepcionistas")
public class Recepcionista {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int documentoR;

    private String nombre;
    private String tipoDoc;
    private String correo;


    public Recepcionista(String nombre, String tipoDoc, String correo){
        
        this.nombre = nombre;
        this.tipoDoc = tipoDoc;
        this.correo = correo;

    }

    public Recepcionista(){
        ;
    }

    public int getDocumentoR() {
        return documentoR;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public String getCorreo() {
        return correo;
    }

    public void setDocumentoR(int documentoR) {
        this.documentoR = documentoR;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    
}
