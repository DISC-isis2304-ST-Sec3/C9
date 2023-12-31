package uniandes.edu.co.proyecto.repositorio;

import java.util.Collection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import uniandes.edu.co.proyecto.modelo.Servicio;



public interface ServicioRepository extends JpaRepository <Servicio, Integer> {
    
     @Query (value = "SELECT * FROM servicios", nativeQuery = true)
    Collection<Servicio> darServicios();

    @Query (value = "SELECT * FROM servicios WHERE idServicio :id", nativeQuery = true)
    Servicio darServicio(@Param("id") int id);


    @Modifying 
    @Transactional
    @Query (value = "INSERT INTO servicios (id, nombre) VALUES(hoteleros_sequence.nextval, :nombre)", nativeQuery = true)
    void insertarServicio(@Param ("nombre") String nombre);

    @Modifying 
    @Transactional
    @Query (value = "UPDATE servicios SET nombre =:nombre WHERE idServicio = id", nativeQuery = true)
    void actualizarServicio(@Param("id") Integer id, @Param ("nombre") String nombre);

    @Modifying 
    @Transactional
    @Query (value = "DELETE FROM servicio WHERE idServicio = :id", nativeQuery = true)
    void eliminarServicio(@Param("id") int id);

}
