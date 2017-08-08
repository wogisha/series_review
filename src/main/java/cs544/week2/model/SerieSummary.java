package cs544.week2.model;

import cs544.week2.entities.Serie;

public class SerieSummary {
	private Serie Serie;
	private int numberOfSeasons;
	private int numberOfEpisodes;
	
	public int getNumberOfEpisodes() {
		return numberOfEpisodes;
	}
	public int getNumberOfSeasons() {
		return numberOfSeasons;
	}
	public Serie getSerie() {
		return Serie;
	}
	public void setNumberOfEpisodes(int numberOfEpisodes) {
		this.numberOfEpisodes = numberOfEpisodes;
	}
	public void setNumberOfSeasons(int numberOfSeasons) {
		this.numberOfSeasons = numberOfSeasons;
	}
	public void setSerie(Serie serie) {
		Serie = serie;
	}
	
	

}
