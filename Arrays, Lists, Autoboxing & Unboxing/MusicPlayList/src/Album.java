import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private ArrayList<Song> songs;

    public Album(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public boolean addSong(String title, String duration) {
        if (findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    public void printSongsList() {

        System.out.println("---------" + this.name.toUpperCase() + "---------");

        for (int i = 0; i < this.songs.size(); i++) {

            Song song = this.songs.get(i);
            System.out.println((i + 1) + ". " + song.toString());
        }

        System.out.println("---------" + this.name.toUpperCase() + "---------");
    }

    private Song findSong(String title) {
        for (Song checkedSong: this.songs) {
            if (checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }
        }
        return null;
    }

    public boolean findSongIndex(int index) {
        return ((index >= 0) && (index <= this.songs.size()));
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber -1;
        if(!findSongIndex(index)) {
            System.out.println("This album does not have a track " +  trackNumber + ".");
            return false;
        }
        if (isOnPlayList(this.songs.get(index).getTitle(), playList)) {
            System.out.println("Track " +  trackNumber + " is already added to the playlist.");
            return false;
        }
        playList.add(this.songs.get(index));
        return true;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song checkedSong = findSong(title);
        if (checkedSong == null) {
            System.out.println("The song " + title + " is not in this album.");
            return false;
        }
        if (isOnPlayList(title, playList)) {
            System.out.println("The song " + title + " is already added to the playlist.");
            return false;
        }
        playList.add(checkedSong);
        return true;
    }

    public boolean isOnPlayList(String title, LinkedList<Song> playList) {
        Song checkSong = findSong(title);
        if (checkSong != null) {
            for (Song playlistSong: playList) {
                if (checkSong == playlistSong) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}