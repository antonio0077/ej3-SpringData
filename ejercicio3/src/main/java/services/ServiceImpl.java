package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import entities.Cliente;
import entities.ClienteRepo;

public class ServiceImpl implements IService{

	@Autowired
	private ClienteRepo clienteRepo;
	
	@Override
	public List<Cliente> searchBy(String name, String apellidos) {
		List<Cliente> result = clienteRepo.findBy(name, apellidos);
		return result;
	}

	

	

}
