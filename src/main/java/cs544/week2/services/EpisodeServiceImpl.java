package cs544.week2.services;

import cs544.week2.entities.*;
import cs544.week2.model.AddCastModel;
import cs544.week2.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EpisodeServiceImpl implements EpisodeService {

    @Autowired
    private EpisodeRepository episodeRepository;

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private RatingRepository ratingRepository;

    @Autowired
    private CastRepository castRepository;

    @Autowired
    private ArtistRepository artistRepository;

    @Override
    public void add(Episode episode) {
        episodeRepository.save(episode);

    }

    @Override
    public void update(Episode episode) {
        episodeRepository.save(episode);

    }

    @Override
    public void remove(Episode episode) {
        episodeRepository.delete(episode);

    }

    @Override
    public void addComment(Long episodeId, Comment comment) {
        Episode episode = episodeRepository.findOne(episodeId);
        comment.setEpisode(episode);
        commentRepository.save(comment);


    }

    @Override
    public void addRating(Long episodeId, Rating rating) {
        Episode episode = episodeRepository.findOne(episodeId);
        rating.setEpisode(episode);
        ratingRepository.save(rating);

    }

    @Override
    public void addCast(Long episodeId, AddCastModel addCastModel) {
        Episode episode = episodeRepository.findOne(episodeId);
        Artist artist = artistRepository.findOne(addCastModel.getArtistId());

        Cast cast = new Cast();
        cast.setEpisode(episode);
        cast.setArtist(artist);
        cast.setNameOfCharacter(addCastModel.getNameOfCharacter());
        castRepository.save(cast);

    }

    @Override
    public void removeCast(Long castId) {
        castRepository.delete(castId);
    }

    @Override
    public Episode findById(Long episodeId) {
        return episodeRepository.findOne(episodeId);
    }

    @Override
    public List<Cast> findCastByEpisodeId(Long id) {
        return castRepository.findByEpisode_Id(id);
    }

    @Override
    public List<Comment> findCommentsByEpisodeId(Long id) {
        return commentRepository.findByEpisode_Id(id);
    }

}
