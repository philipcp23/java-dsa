public class Main {

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

        var album = new Album("Abbey Road", "The Beatles"); // Side one
        album.addSong("Come Together", 4.19);
        album.addSong("Something", 3.02);
        album.addSong("Maxwell's Silver Hammer", 3.27);
        album.addSong("Oh! Darling", 3.27);
        album.addSong("Octopus's Garden", 2.51);
        album.addSong("I want you (She's so heavy)", 7.47);

    }
}
