package uniandes.edu.co.proyecto.repositorio;

import java.util.Collection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import uniandes.edu.co.proyecto.modelo.Hotel;

public interface HotelRepository extends JpaRepository <Hotel, Integer>{
    
    @Query (value = "SELECT * FROM hoteles", nativeQuery = true)
    Collection<Hotel> darHoteles();

    @Query (value = "SELECT * FROM hoteles WHERE idHotel :id", nativeQuery = true)
    Hotel darHotel(@Param("id") int id);


    @Modifying 
    @Transactional
    @Query (value = "INSERT INTO hoteles (idHotel, nombre, ubicacion, estrellas) VALUES(hoteleros_sequence.nextval, :nombre, :ubicacion, :estrellas)", nativeQuery = true)
    void insertarHotel(@Param ("nombre") String nombre, @Param ("ubicacion") String ubicacion, @Param ("estrellas") Integer estrellas);

    @Modifying 
    @Transactional
    @Query (value = "UPDATE hoteles SET nombre =:nombre, ubicacion =:ubicacion, estrellas =:estrellas WHERE idHotel = id", nativeQuery = true)
    void actualizarHotel(@Param("id") Integer id, @Param ("nombre") String nombre, @Param ("ubicacion") String ubicacion, @Param ("estrellas") Integer estrellas);

    @Modifying 
    @Transactional
    @Query (value = "DELETE FROM hoteles WHERE idHotel = :id", nativeQuery = true)
    void eliminarHotel(@Param("id") int id);
}
