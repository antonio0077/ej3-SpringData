package entities;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepo extends JpaRepository<Cliente, Long>{
	
	public List<Cliente> findBy(String name, String apellidos);
}
