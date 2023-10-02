package uniandes.edu.co.proyecto.repositorio;

import java.util.Collection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import uniandes.edu.co.proyecto.modelo.TipoHabitacion;




public interface TipoHabitacionRepository extends JpaRepository <TipoHabitacion, Integer>{

      @Query (value = "SELECT * FROM tiposHabitaciones", nativeQuery = true)
    Collection<TipoHabitacion> darTiposHabitaciones();

    @Query (value = "SELECT * FROM tiposHabitaciones WHERE idTipo :id", nativeQuery = true)
    TipoHabitacion darTipoHabitacion(@Param("id") int id);


    @Modifying 
    @Transactional
    @Query (value = "INSERT INTO tiposHabitaciones (idTipo, nombre) VALUES(hoteleros_sequence.nextval, :nombre)", nativeQuery = true)
    void insertarServicio(@Param ("nombre") String nombre);

    @Modifying 
    @Transactional
    @Query (value = "UPDATE tiposHabitaciones SET nombre =:nombre WHERE idTipo = id", nativeQuery = true)
    void actualizarTipoHabitacion(@Param("id") Integer idTipo, @Param ("nombre") String nombre);

    @Modifying 
    @Transactional
    @Query (value = "DELETE FROM servicio WHERE idTipo = :id", nativeQuery = true)
    void eliminarTipoHabitacion(@Param("id") int id);
}
