package cs544.week2.services;

import java.util.List;

import cs544.week2.entities.Season;
import cs544.week2.entities.Serie;
import cs544.week2.model.SerieSummary;
import cs544.week2.repositories.SeasonRepository;
import cs544.week2.repositories.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class SeriesServiceImpl implements SeriesService {

	@Autowired
	private SeasonRepository seasonRepository;

	@Autowired
    private SerieRepository serieRepository;

    @Override
	public void add(Serie serie) {
        serieRepository.save(serie);
	}

	@Override
	public void update(Serie serie) {
        serieRepository.save(serie);

	}

	@Override
	public void remove(Long serieId) {
		serieRepository.delete(serieId);
	}

	@Override
	public SerieSummary getSeriesSummary(Long serieId) {

		return null;
	}

    @Override
    public List<SerieSummary> findSeriesSummarys(String query) {

        if (query == null) {
            query = "";
        }

        return serieRepository.findSeriesSummary(query);
    }

    @Override
    public SerieSummary findSerieSummary(Long id) {

        SerieSummary serieSummary = serieRepository.findSerieSummary(id);
        serieSummary.setSeasonList(seasonRepository.findBySerie_Id(id));

        return serieSummary;
    }

    @Override
	public List<Season> getSeriesSeasons(Long serieId) {
		return seasonRepository.findBySerie_Id(serieId);
	}

    @Override
	public List<Serie> findSeries(String searchQuery) {
		return serieRepository.findSeriesQuery(searchQuery);
	}

    @Override
    public void addSeason(Long serieId, Season season) {
        Serie serie = serieRepository.findOne(serieId);

        season.setSerie(serie);

        seasonRepository.save(season);

    }

}
