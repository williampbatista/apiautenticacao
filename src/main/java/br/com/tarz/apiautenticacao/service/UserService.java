package br.com.tarz.apiautenticacao.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

import br.com.tarz.apiautenticacao.entity.User;
import br.com.tarz.apiautenticacao.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository repository;

	public User findByUsername(String username) {
		Optional<User> user = repository.findByUsername(username);

		if (user.isPresent())
			return user.get();
		return null;
	}

	public User save(User user) {
		String generatedSecuredPasswordHash = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt(12));
		user.setPassword(generatedSecuredPasswordHash);
		return repository.save(user);
	}

}
