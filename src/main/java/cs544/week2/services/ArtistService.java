package cs544.week2.services;

import cs544.week2.entities.Artist;
import cs544.week2.entities.Cast;

import java.util.List;

public interface ArtistService {
	void add(Artist artist);
	void update(Artist artist);
	void remove(Artist artist);

	List<Artist> findArtists();


}
