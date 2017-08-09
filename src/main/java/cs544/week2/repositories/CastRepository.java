package cs544.week2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import cs544.week2.entities.Cast;

import java.util.List;

public interface CastRepository extends JpaRepository<Cast, Long> {

    List<Cast> findByEpisode_Id(Long id);

}
