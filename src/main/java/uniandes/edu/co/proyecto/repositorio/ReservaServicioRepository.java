package uniandes.edu.co.proyecto.repositorio;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import uniandes.edu.co.proyecto.modelo.ReservaServicio;



public interface ReservaServicioRepository extends JpaRepository <ReservaServicio, Integer>{
    
     @Query (value = "SELECT * FROM reservasServicios", nativeQuery = true)
    Collection<ReservaServicio> darReservasServicios();

    @Query (value = "SELECT * FROM reservasServicios WHERE idReserva :id", nativeQuery = true)
    ReservaServicio darReservaServicio(@Param("id") int idReserva);


    @Modifying 
    @Transactional
    @Query (value = "INSERT INTO reservasServicio (idReserva) VALUES(hoteleros5_sequence.nextval, :idReserva)", nativeQuery = true)
    void insertarReservaServicio(@Param ("fechaEntrada") String fechaEntrada, @Param ("fechaSalida") String fechaSalida, @Param ("numPersonas") String numPersonas);

    @Modifying 
    @Transactional
    @Query (value = "UPDATE reservasServicio SET fechaEntrada =:fechaEntrada, fechaSalida =:fechaSalida, numPersonas =:numPersonas WHERE idReserva=id", nativeQuery = true)
    void actualizarReservaServicio(@Param("id") Integer idReserva);

    @Modifying 
    @Transactional
    @Query (value = "DELETE FROM reservasServicio WHERE idReserva = :id", nativeQuery = true)
    void eliminarReservaServicio(@Param("id") int idReserva);

}
