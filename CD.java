import java.time.LocalDate;

public class CD extends Item {

    private String artist;
    private int tracks;

    public CD(String id, String title, LocalDate date,
              String artist, int tracks) {

        super(id, title, date, 14);

        this.artist = artist;
        this.tracks = tracks;
    }

    public String getArtist() {
        return artist;
    }

    public int getTracks() {
        return tracks;
    }
}
