package uniandes.edu.co.proyecto.repositorio;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import uniandes.edu.co.proyecto.modelo.ReservaHabitacion;

public interface ReservaHabitacionRepository extends JpaRepository <ReservaHabitacion, Integer>{
    
    @Query (value = "SELECT * FROM reservas", nativeQuery = true)
    Collection<ReservaHabitacion> darReservas();

    @Query (value = "SELECT * FROM reservas WHERE idReservaHab :id", nativeQuery = true)
    ReservaHabitacion darReserva(@Param("id") int idReservaHab);


    @Modifying 
    @Transactional
    @Query (value = "INSERT INTO reservas (idReservaHab, fechaEntrada, fechaSalida, numPersonas) VALUES(hoteleros5_sequence.nextval, :idReservaHab, :fechaEntrada, :fechaSalida, numPersonas)", nativeQuery = true)
    void insertarReserva(@Param ("fechaEntrada") String fechaEntrada, @Param ("fechaSalida") String fechaSalida, @Param ("numPersonas") String numPersonas);

    @Modifying 
    @Transactional
    @Query (value = "UPDATE reservas SET fechaEntrada =:fechaEntrada, fechaSalida =:fechaSalida, numPersonas =:numPersonas WHERE idReservaHab=id", nativeQuery = true)
    void actualizarReserva(@Param("id") Integer idReservaHab, @Param ("fechaEntrada") String fechaEntrada, @Param ("fechaSalida") String fechaSalida, @Param ("numPersonas") String numPersonas);

    @Modifying 
    @Transactional
    @Query (value = "DELETE FROM reservas WHERE idReservaHab = :id", nativeQuery = true)
    void eliminarReserva(@Param("id") int idReservaHab);

}
