package uniandes.edu.co.proyecto.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import uniandes.edu.co.proyecto.modelo.Cliente;

import java.util.Collection;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface ClienteRepository extends JpaRepository <Cliente, Integer>{
    
     @Query (value = "SELECT * FROM clientes", nativeQuery = true)
    Collection<Cliente> darClientes();

    @Query (value = "SELECT * FROM clientes WHERE documentoC :id", nativeQuery = true)
    Cliente darCliente(@Param("id") int documentoC);


    @Modifying 
    @Transactional
    @Query (value = "INSERT INTO clientes (documentoC, tipoDoc, nombre, correo, reservaHabitacion) VALUES(hoteleros_sequence.nextval, :tipoDoc, :nombre, :correo, reservaHabitacion)", nativeQuery = true)
    void insertarHotel(@Param ("tipoDoc") Integer tipoDoc, @Param ("nombre") String nombre, @Param ("correo") String correo, @Param ("reservaHabitacion")Integer reservaHabitacion);

    @Modifying 
    @Transactional
    @Query (value = "UPDATE clientes SET tipoDoc =:tipoDoc, nombre =:nombre, correo =:correo WHERE documentoC=id", nativeQuery = true)
    void actualizarHotel(@Param("id") Integer documentoC, @Param ("tipoDoc") String tipoDoc, @Param ("nombre") String nombre, @Param ("correo") String correo, @Param("reservaHabitacion")Integer reservaHabitacion);

    @Modifying 
    @Transactional
    @Query (value = "DELETE FROM clientes WHERE documentoC = :id", nativeQuery = true)
    void eliminarHotel(@Param("id") int documentoC);
}

