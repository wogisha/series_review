package cs544.week2.entities;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
public class Episode {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String description;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date airedDate;

	@OneToMany(mappedBy = "episode" )
	private List<Comment> comments;

	@OneToMany(mappedBy = "episode")
	private List<Cast> cast;

	@OneToMany(mappedBy = "episode")
	private List<Rating> ratings;

	@ManyToOne
	private Season season;

	@Override
	public String toString() {
		return "Episode{" +
				"description='" + description + '\'' +
				", airedDate=" + airedDate +
				'}';
	}

	public Date getAiredDate() {
		return airedDate;
	}

	public List<Cast> getCast() {
		return cast;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public String getDescription() {
		return description;
	}

	public Long getId() {
		return id;
	}

	public List<Rating> getRatings() {
		return ratings;
	}

	public void setAiredDate(Date airedDate) {
		this.airedDate = airedDate;
	}

	public void setCast(List<Cast> cast) {
		this.cast = cast;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}

	public Season getSeason() {
		return season;
	}

	public void setSeason(Season season) {
		this.season = season;
	}
}
