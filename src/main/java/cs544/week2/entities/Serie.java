package cs544.week2.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import cs544.week2.entities.enums.Genre;


@Entity
public class Serie {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String description;
	private String studio;

	@Enumerated(EnumType.STRING)
	private Genre genre;

	@OneToOne
	private Artist director;
	
	@OneToMany(mappedBy="serie")
	private List<Season> seasons = new ArrayList<>();

	@Override
	public String toString() {
		return "Serie{" +
				"id=" + id +
				", name='" + name + '\'' +
				", description='" + description + '\'' +
				", studio='" + studio + '\'' +
				", genre=" + genre +
				'}';
	}

	@OneToMany(mappedBy="serie")
	private List<Rating> ratings;

	public String getDescription() {
		return description;
	}

	public Artist getDirector() {
		return director;
	}

	public Genre getGenre() {
		return genre;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public List<Rating> getRatings() {
		return ratings;
	}

	public List<Season> getSeasons() {
		return seasons;
	}

	public String getStudio() {
		return studio;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setDirector(Artist director) {
		this.director = director;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}

	public void setSeasons(List<Season> seasons) {
		this.seasons = seasons;
	}
	
	public void setStudio(String studio) {
		this.studio = studio;
	}

	public void addSeason(Season season) {
		season.setSerie(this);
		seasons.add(season);
	}
	
}
