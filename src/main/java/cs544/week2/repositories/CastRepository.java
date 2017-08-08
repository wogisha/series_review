package cs544.week2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import cs544.week2.entities.Cast;

public interface CastRepository extends JpaRepository<Cast, Long> {

}
