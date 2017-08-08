package cs544.week2.services;

import cs544.week2.entities.Episode;
import cs544.week2.entities.Rating;
import cs544.week2.entities.Season;

public interface SeasonService {
	void add(Season season);
	void update(Season season);
	void remove(Season season);
	void addRating(Long seasonId, Rating rating);
	void addEpisode(Long seasonId,Episode episode);
	void removeEpisode(Long seasonId,Episode episode);
}
