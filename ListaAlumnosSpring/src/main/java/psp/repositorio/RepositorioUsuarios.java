package psp.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import psp.pojo.Usuario;

@Repository
public interface RepositorioUsuarios extends JpaRepository<Usuario,String> {
	
}
