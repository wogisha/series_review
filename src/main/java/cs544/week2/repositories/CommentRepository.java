package cs544.week2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import cs544.week2.entities.Comment;

public interface CommentRepository extends JpaRepository<Comment	, Long> {

}
