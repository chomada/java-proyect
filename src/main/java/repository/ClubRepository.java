package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Club;

public interface ClubRepository extends JpaRepository<Club, Integer> {
	
	
}
