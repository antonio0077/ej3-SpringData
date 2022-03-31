package com.nttdata.ejercicio3;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import entities.Cliente;
import services.IService;

@SpringBootApplication
public class Ejercicio3Application implements CommandLineRunner {

	@Autowired
	private IService clienteService;
	
	public static void main(String[] args) {
		SpringApplication.run(Ejercicio3Application.class, args);
	}

	@SuppressWarnings("deprecation")
	@Override
	public void run(String... args) throws Exception {
		
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		
		c1.setIdCliente(1L);
		c1.setNombreCliente("Antonio");
		c1.setapellidosCliente("Gallardo");
		c1.setDocIdentidad("12345678A");
		c1.setNacimiento(new Date(101, 3, 8));
		
		c2.setIdCliente(1L);
		c2.setNombreCliente("Marco");
		c2.setapellidosCliente("Gallardo");
		c2.setDocIdentidad("01223333E");
		c2.setNacimiento(new Date(101, 3, 8));		

		System.out.println("-- BÚSQUEDA DE CLIENTES POR NOMBRE Y APELLIDOS --");

		clienteService.searchBy("Antonio", "Gallardo").forEach(System.out::println);
		
	}

}
