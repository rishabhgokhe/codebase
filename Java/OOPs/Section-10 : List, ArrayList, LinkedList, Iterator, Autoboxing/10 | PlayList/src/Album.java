import java.util.ArrayList;

public class Album {
    private String name;
    private String artist;

    ArrayList<Song> songs = new ArrayList<>();

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
    }
    

}
