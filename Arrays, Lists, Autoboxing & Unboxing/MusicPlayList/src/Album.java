import java.util.ArrayList;

public class Album {
    private String album;
    private String artist;
    private ArrayList<Song> songs;


    public Album(String album, String artist, ArrayList<Song> songs) {
        this.album = album;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    private boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title) {
        for (Song checkedSong: songs) {
            if (checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }
        }
    }


}
