package cs544.week2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import cs544.week2.entities.Season;

import java.util.List;

public interface SeasonRepository extends JpaRepository<Season, Long> {
    List<Season> findBySerie_Id(Long id);

}
