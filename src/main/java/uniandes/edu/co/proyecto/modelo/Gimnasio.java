package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="gimnasios")
public class Gimnasio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idGym;

    private Servicio idServicio; 

}
