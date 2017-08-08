package cs544.week2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import cs544.week2.entities.Episode;

public interface EpisodeRepository extends JpaRepository<Episode, Long> {

}
