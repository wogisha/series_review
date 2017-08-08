package cs544.week2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import cs544.week2.entities.Season;

public interface SeasonRepository extends JpaRepository<Season, Long> {

}
