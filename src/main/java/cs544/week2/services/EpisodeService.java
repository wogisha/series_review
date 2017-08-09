package cs544.week2.services;

import cs544.week2.entities.Cast;
import cs544.week2.entities.Comment;
import cs544.week2.entities.Episode;
import cs544.week2.entities.Rating;
import cs544.week2.model.AddCastModel;

import java.util.List;

public interface EpisodeService {

	void add(Episode episode);
	void update(Episode episode);
	void remove(Long episodeId);
	void addComment(Long episodeId, Comment comment);
	void addRating(Long episodeId, Rating rating);
	void addCast(Long episodeId, AddCastModel addCastModel);
	void removeCast(Long castId);

	Episode findById(Long episodeId);

	List<Cast> findCastByEpisodeId(Long id);

	List<Comment> findCommentsByEpisodeId(Long id);

	void removeComment(Long id);
}
