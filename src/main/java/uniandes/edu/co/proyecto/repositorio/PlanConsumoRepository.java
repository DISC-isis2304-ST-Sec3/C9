package uniandes.edu.co.proyecto.repositorio;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import uniandes.edu.co.proyecto.modelo.PlanConsumo;


public interface PlanConsumoRepository extends JpaRepository <PlanConsumo, Integer>{
    
     @Query (value = "SELECT * FROM planesConsumo", nativeQuery = true)
    Collection<PlanConsumo> darPlanesConsumo();

    @Query (value = "SELECT * FROM planesConsumo WHERE idPlanConsumo :id", nativeQuery = true)
    PlanConsumo darPlanConsumo(@Param("id") int idPlanConsumo);


    @Modifying 
    @Transactional
    @Query (value = "INSERT INTO planesConsumo (idPlanConsumo) VALUES(hoteleros_sequence.nextval", nativeQuery = true)
    void insertarPlanConsumo(@Param ("id") Integer idPlanConsumo);

    @Modifying 
    @Transactional
    @Query (value = "UPDATE planesConsumo SET tipoDoc =:tipoDoc, nombre =:nombre, correo =:correo WHERE documentoC=id", nativeQuery = true)
    void actualizarPlanConsumo(@Param("id") Integer documentoC, @Param ("tipoDoc") String tipoDoc, @Param ("nombre") String nombre, @Param ("correo") String correo, @Param("reservaHabitacion")Integer reservaHabitacion);

    @Modifying 
    @Transactional
    @Query (value = "DELETE FROM planesConsumo WHERE idPlanConsumo = :id", nativeQuery = true)
    void eliminarPlanConsumo(@Param("id") int idPlanConsumo);
}
