public class Song {

    private String title;
    private double duration;

    public boolean addSong(String title, double duration) {
        try {
            this.title = title;
            this.duration = duration;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    

}
