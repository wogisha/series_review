package cs544.week2.services;

import cs544.week2.entities.Episode;
import cs544.week2.entities.Rating;
import cs544.week2.entities.Season;
import cs544.week2.repositories.EpisodeRepository;
import cs544.week2.repositories.RatingRepository;
import cs544.week2.repositories.SeasonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class SeasonServiceImpl implements SeasonService {


    @Autowired
    private SeasonRepository seasonRepository;

    @Autowired
    private EpisodeRepository episodeRepository;

    @Autowired
    private RatingRepository ratingRepository;

    @Override
    public void add(Season season) {
        seasonRepository.save(season);

    }

    @Override
    public void update(Season season) {
        seasonRepository.save(season);

    }

    @Override
    public void remove(Long seasonId) {
        seasonRepository.delete(seasonId);

    }

    @Override
    public void addRating(Long seasonId, Rating rating) {
        Season season = seasonRepository.findOne(seasonId);
        rating.setSeason(season);

        ratingRepository.save(rating);
    }

    @Override
    public void addEpisode(Long seasonId, Episode episode) {
        Season season = seasonRepository.findOne(seasonId);

        episode.setSeason(season);

        episodeRepository.save(episode);


    }

    @Override
    public void removeEpisode(Long episodeId) {

        episodeRepository.delete(episodeId);

    }

    @Override
    public List<Episode> getSeasonEpisodes(Long seasonId) {

        return null;
    }

    @Override
    public Season getSeasonInformation(Long seasonId) {
        Season season = seasonRepository.findOne(seasonId);
        season.setEpisodes(episodeRepository.findBySeason(season));
        return season;
    }

}
