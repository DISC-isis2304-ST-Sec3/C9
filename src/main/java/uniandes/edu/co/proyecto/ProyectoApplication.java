package uniandes.edu.co.proyecto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Collection;
import uniandes.edu.co.proyecto.modelo.Hotel;
import uniandes.edu.co.proyecto.repositorio.HotelRepository;

@SpringBootApplication
public class ProyectoApplication implements CommandLineRunner {

	@Autowired
	private HotelRepository hotelRepository;
	public static void main(String[] args) {
		SpringApplication.run(ProyectoApplication.class, args);
	}

	@Override
	public void run(String... args){

		Collection<Hotel> hoteles = hotelRepository.darHoteles();

		for(Hotel h : hoteles){
			System.out.println(h);
		}
		
	}

}
