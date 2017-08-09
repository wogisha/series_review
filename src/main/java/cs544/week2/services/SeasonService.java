package cs544.week2.services;

import cs544.week2.entities.Episode;
import cs544.week2.entities.Rating;
import cs544.week2.entities.Season;

import java.util.List;

public interface SeasonService {
	void add(Season season);
	void update(Season season);
	void remove(Long seasonId);
	void addRating(Long seasonId, Rating rating);
	void addEpisode(Long seasonId,Episode episode);
	void removeEpisode(Long episodeId);

    List<Episode> getSeasonEpisodes(Long seasonId);
    Season getSeasonInformation(Long seasonId);
}
