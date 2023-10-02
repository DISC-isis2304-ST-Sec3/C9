package uniandes.edu.co.proyecto.repositorio;

import java.util.Collection;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import uniandes.edu.co.proyecto.modelo.Habitacion;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HabitacionRepository extends JpaRepository <Habitacion, Integer>{
    
    @Query (value = "SELECT * FROM habitaciones", nativeQuery = true)
    Collection<Habitacion> darHabitacions();

    @Query (value = "SELECT * FROM habitaciones WHERE idHabitacion :id", nativeQuery = true)
    Habitacion darHabitaciones(@Param("id") int idHabitacion);

    @Modifying 
    @Transactional
    @Query (value = "INSERT INTO habitaciones (idHabitaciones, numeroDeHabitacion, capacidad, tipo, costo, ocupado) VALUES(hoteleros_sequence.nextval, :numerodeHabitaciones, :capacidad, :tipo, costo, :ocupado)", nativeQuery = true)
    void insertarHabitacion(@Param ("numeroDeHabitacion") Integer numeroDeHabitacion, @Param ("capacidad") String capacidad, @Param ("tipo") String tipo, @Param ("costo")Integer costo, @Param("ocupado")boolean ocupado);

    @Modifying 
    @Transactional
    @Query (value = "UPDATE habitaciones SET numeroDeHabitaciones =:numeroDeHabitaciones, capacidad=:capacidad, tipo =:tipo, costo =:costo, ocupado =: ocupado WHERE idHabitacion =id", nativeQuery = true)
    void actualizarHabitacion(@Param("id") Integer idHabitacion, @Param ("numeroDeHabitacion") Integer numeroDeHabitacion, @Param ("capacidad") Integer capacidad, @Param ("tipo") String tipo, @Param("costo")Integer costo, @Param("ocupado") boolean ocupado);

    @Modifying 
    @Transactional
    @Query (value = "DELETE FROM habitaciones WHERE idHabitacion = :id", nativeQuery = true)
    void eliminarHabitacion(@Param("id") int idHabitacion);

}
