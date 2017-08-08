package cs544.week2.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Comment {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long id;
	private String description;
	private String givenBy;
	
	@ManyToOne
	private Episode episode;
	

	public String getDescription() {
		return description;
	}

	public Episode getEpisode() {
		return episode;
	}

	public String getGivenBy() {
		return givenBy;
	}

	public Long getId() {
		return id;
	}

	public void setDescription(String description) {
		this.description = description;
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
}
