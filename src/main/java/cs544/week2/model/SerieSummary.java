package cs544.week2.model;

import cs544.week2.entities.Season;
import cs544.week2.entities.Serie;

import java.util.List;

public class SerieSummary {
    private Serie Serie;
    private int numberOfSeasons;
    private int numberOfEpisodes;

    private List<Season> seasonList;

    public SerieSummary(cs544.week2.entities.Serie serie, int numberOfSeasons, int numberOfEpisodes) {
        Serie = serie;
        this.numberOfSeasons = numberOfSeasons;
        this.numberOfEpisodes = numberOfEpisodes;
    }
    public SerieSummary(cs544.week2.entities.Serie serie, long numberOfSeasons, long numberOfEpisodes) {
        Serie = serie;
        this.numberOfSeasons = (int) numberOfSeasons;
        this.numberOfEpisodes = (int) numberOfEpisodes;
    }

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


    public List<Season> getSeasonList() {
        return seasonList;
    }

    public void setSeasonList(List<Season> seasonList) {
        this.seasonList = seasonList;
    }
}
