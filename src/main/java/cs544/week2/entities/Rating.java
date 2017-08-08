package cs544.week2.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Rating {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private double rating;
	private String givenBy;
	
	@ManyToOne
	private Serie serie;
	
	@ManyToOne
	private Season season;
	
	@ManyToOne
	private Episode episode;

	public Episode getEpisode() {
		return episode;
	}

	public String getGivenBy() {
		return givenBy;
	}

	public Long getId() {
		return id;
	}

	public double getRating() {
		return rating;
	}

	public Season getSeason() {
		return season;
	}

	public Serie getSerie() {
		return serie;
	}

	public void setEpisode(Episode episode) {
		this.episode = episode;
	}

	public void setGivenBy(String givenBy) {
		this.givenBy = givenBy;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public void setSeason(Season season) {
		this.season = season;
	}

	public void setSerie(Serie serie) {
		this.serie = serie;
	}
}
