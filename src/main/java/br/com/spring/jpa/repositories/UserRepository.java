package br.com.spring.jpa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.spring.jpa.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{

	@Query("SELECT u FROM User u WHERE u.firstName = :firstName")
	public List<User> buscarUsuarioPorPrimeiroNome(String firstName);
	
	@Query("SELECT u FROM User u Where u.firstName like %:string%")
	public List<User> buscarUsuarioPorSubstringPrimeiroNome(String string);
	
	@Query("SELECT u FROM User u WHERE u.lastName = :lastName")
	public List<User> buscarUsuarioPorSobreNome(String lastName);
	
	@Query("SELECT u FROM User u Where u.lastName like %:string%")
		List<User> buscarUsuarioPorSubstringSobreNome(String string);
	
	@Query("SELECT u FROM User u WHERE u.password = :password")
		List<User> buscarUsuarioPorSenha(String password);
	
	 @Query("select u from User u where u.firstName like '%Juan%'")
	    List<User> procurar();
	
}
