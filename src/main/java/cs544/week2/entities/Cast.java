package cs544.week2.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Cast {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private Episode episode;
	
	@ManyToOne
	private Artist artist;
	
	private String nameOfCharacter;
	

	public Artist getArtist() {
		return artist;
	}

	public Episode getEpisode() {
		return episode;
	}

	public Long getId() {
		return id;
	}

	public String getNameOfCharacter() {
		return nameOfCharacter;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}

	public void setEpisode(Episode episode) {
		this.episode = episode;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNameOfCharacter(String nameOfCharacter) {
		this.nameOfCharacter = nameOfCharacter;
	}
	
	

}
