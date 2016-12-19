package psp.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import psp.pojo.User;

public interface RepositorioUsuarios extends JpaRepository<User,String> {
	
}
