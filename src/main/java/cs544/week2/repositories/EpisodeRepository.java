package cs544.week2.repositories;

import cs544.week2.entities.Season;
import org.springframework.data.jpa.repository.JpaRepository;

import cs544.week2.entities.Episode;

import java.util.List;

public interface EpisodeRepository extends JpaRepository<Episode, Long> {

    List<Episode> findBySeason(Season season);
}
