package cs544.week2.services;

import cs544.week2.entities.Artist;
import cs544.week2.entities.Comment;
import cs544.week2.entities.Episode;
import cs544.week2.entities.Rating;

public interface EpisodeService {

	void add(Episode episode);
	void update(Episode episode);
	void remove(Episode episode);
	void addComment(Long episodeId, Comment comment);
	void addRating(Long episodeId, Rating rating);
	void addCast(Long episodeId, Artist artist);
	void removeCast(Long episodeId, Artist artist);
	
}
