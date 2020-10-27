import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {
        /*
        --Create a program that implements a playlist for songs
        --Create a Song class having Title and Duration for a song.
        --The program will have an Album class containing a list of songs.
        --The albums will be stored in ArrayList
        Songs from different albums can be added to the playlist and will appear in the list in order
        they are added.
        Once the songs have been added to the playlist, create a menu of options to:-
        Quit, Skip forward to the next song, skip backwards to a previous song. Replay the current song.
        List the songs in the playlist
        A song must exist in an album before it can be added to the playlist (so you can only play songs that you own).
        Hint: To replay a song, consider what happened when we went back and forth from a city before we
        started tracking the direction we were going.
        As an optional extra, provide an option to remove the current song from the playlist
        (hit: listiterator.remove();
         */


        var album = new Album("Abbey Road (Side one)", "The Beatles");
        album.addSong("Come Together", 4.19);
        album.addSong("Something", 3.02);
        album.addSong("Maxwell's Silver Hammer", 3.27);
        album.addSong("Oh! Darling", 3.27);
        album.addSong("Octopus's Garden", 2.51);
        album.addSong("I want you (She's so heavy)", 7.47);
        albums.add(album);

        album = new Album("Abbey Road (Side Two)", "The Beatles");
        album.addSong("Here Comes the Sun", 3.05);
        album.addSong("Because", 2.45);
        album.addSong("You Never Give Me Your Money", 4.03);
        album.addSong("Sun King", 2.26);
        album.addSong("Mean Mr. Mustard", 1.06);
        album.addSong("Polythene Pam", 1.13);
        album.addSong("She Came In Through the Bathroom Window", 1.58);
        album.addSong("Golden Slumbers", 1.31);
        album.addSong("Carry That Weight", 1.36);
        album.addSong("The End", 2.05);
        album.addSong("Her Majesty (hidden track)", 0.23);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<>();
        albums.get(0).addToPlayList("Come Together", playList);
        albums.get(0).addToPlayList("Something", playList);
        albums.get(1).addToPlayList("Here Comes the Sun", playList);
        albums.get(0).addToPlayList("Yellow Submarine", playList); // Not in album
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(4, playList);
        albums.get(1).addToPlayList(6, playList);
        albums.get(1).addToPlayList(24, playList); // No an index

        play(playList);

    }

    private static void play(LinkedList<Song> playList) {
        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0) {
            System.out.println("No songs in the playlist");
        } else {
            System.out.println("Now playing: " + listIterator.next().toString());
        }
    }
}
