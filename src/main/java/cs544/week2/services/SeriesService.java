package cs544.week2.services;

import java.util.List;

import cs544.week2.entities.Season;
import cs544.week2.entities.Serie;
import cs544.week2.model.SerieSummary;

public interface SeriesService {
	void add(Serie serie);
	void update(Serie serie);
	void remove(Long serieId);
	SerieSummary getSeriesSummary(Long serieId);
	List<SerieSummary> findSeriesSummarys(String query);
	SerieSummary findSerieSummary(Long id);
	List<Season> getSeriesSeasons(Long serieId);

	List<Serie> findSeries(String searchQuery);

	void addSeason(Long serieId, Season season);


}
