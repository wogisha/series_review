package cs544.week2.repositories;

import cs544.week2.entities.Cast;
import org.springframework.data.jpa.repository.JpaRepository;

import cs544.week2.entities.Comment;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByEpisode_Id(Long id);
}
