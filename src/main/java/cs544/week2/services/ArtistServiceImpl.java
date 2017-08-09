package cs544.week2.services;

import cs544.week2.entities.Artist;
import cs544.week2.repositories.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ArtistServiceImpl implements ArtistService {

	@Autowired
    private ArtistRepository artistRepository;

	@Override
	public void add(Artist artist) {
		artistRepository.save(artist);
	}

	@Override
	public void update(Artist artist) {
		artistRepository.save(artist);

	}

	@Override
	public void remove(Artist artist) {
		artistRepository.delete(artist);

	}

	@Override
	public List<Artist> findArtists() {
		return artistRepository.findAll();
	}

}
