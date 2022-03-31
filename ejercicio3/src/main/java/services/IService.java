package services;

import java.util.List;

import entities.Cliente;

public interface IService {
	
	public List<Cliente> searchBy(String name, String apellidos);


}
