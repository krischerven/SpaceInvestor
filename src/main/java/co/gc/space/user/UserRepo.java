package co.gc.space.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
	public Optional<User> findByEmail(String email);
}
