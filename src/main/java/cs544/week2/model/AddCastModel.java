package cs544.week2.model;

/**
 * Created by wogisha on 08/08/2017.
 */
public class AddCastModel {
    private String nameOfCharacter;
    private Long artistId;

    public Long getArtistId() {
        return artistId;
    }

    public void setArtistId(Long artistId) {
        this.artistId = artistId;
    }

    public String getNameOfCharacter() {

        return nameOfCharacter;
    }

    public void setNameOfCharacter(String nameOfCharacter) {
        this.nameOfCharacter = nameOfCharacter;
    }

    @Override
    public String toString() {
        return "AddCastModel{" +
                "nameOfCharacter='" + nameOfCharacter + '\'' +
                ", artistId=" + artistId +
                '}';
    }
}
