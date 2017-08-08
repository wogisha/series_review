package cs544.week2.services;

import java.util.List;

import cs544.week2.entities.Episode;
import cs544.week2.entities.Season;
import cs544.week2.entities.Serie;
import cs544.week2.entities.enums.Genre;

public interface SeriesService {
	void add(Serie serie);
	void update(Serie serie);
	void remove(Serie serie);
	Serie getSeriesSummary();
	List<Season> getSeriesSeasons();
	List<Episode> getSeriesEpisodes();
	List<Serie> findByNameOfShow(String name);
	List<Serie> findByGenreOfShow(Genre genre);
	List<Serie> findByRatingOfShow(double rating);
	List<Serie> findByNameOfTheArtist(String nameOfTheArtist);
	List<Serie> findByNameOfCharacter(String nameOfCharacter);
	List<Serie> findByDirectorOfShow(String nameOfDirector);
	
	
}
