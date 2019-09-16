package co.gc.space.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import co.gc.space.user.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	public Optional<User> findByEmail(String email);
}
