package cs544.week2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import cs544.week2.entities.Rating;

public interface RatingRepository extends JpaRepository<Rating, Long> {

}
