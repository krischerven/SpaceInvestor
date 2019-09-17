package co.gc.space.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.gc.space.land.House;

public interface HouseRepo extends JpaRepository<House, Integer> {
	
	List<House> findByUserId(Integer id);
}
