package cs544.week2.entities;

import java.util.List;

import javax.persistence.*;


@Entity
public class Season {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private String poster;

	private String summary;

	private int year;

	@OneToMany(mappedBy="season", fetch = FetchType.LAZY)
	private List<Episode> episodes;

	@OneToMany(mappedBy="season")
	private List<Rating> ratings;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Serie serie;

	@Override
	public String toString() {
		return "Season {" +
				"poster='" + poster + '\'' +
				", summary='" + summary + '\'' +
				", year=" + year +
				'}';
	}

	public List<Episode> getEpisodes() {
		return episodes;
	}

	public Long getId() {
		return id;
	}

	public String getPoster() {
		return poster;
	}

	public List<Rating> getRatings() {
		return ratings;
	}

	public Serie getSerie() {
		return serie;
	}

	public String getSummary() {
		return summary;
	}

	public int getYear() {
		return year;
	}

	public void setEpisodes(List<Episode> episodes) {
		this.episodes = episodes;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}
	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}
	public void setSerie(Serie serie) {
		this.serie = serie;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
}
