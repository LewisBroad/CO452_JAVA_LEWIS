package CW1;
import helpers.*;
import java.util.ArrayList;

/**This class allows the user to
 * 
 * Add songs to a list.
 * Remove songs from a list.
 * View the list
 * @author Lewis Broad
 */
public class SongList 
{
    private ArrayList<Song> songs;

    public SongList()
    {
        songs = new ArrayList<Song>();
        addSomeSongs();
        doMainMenu();
    }
        // This allows the "Program.java" file to fetch the code from this file. The public parts can be retreived.

    public void doMainMenu() 
    {
        boolean wantToQuit = false;

        while(!wantToQuit)
        {
            displayMenu();
            int choice = InputReader.getInt("Please enter your choice > ");

            switch(choice)
            {
                case 1: addSong();break;
                case 2: deleteSong();break;
                case 3: printSongs();break;
                case 4: topSongs();
                case 5: wantToQuit = true; break;
            }//This will give a list of options to the user for the first input and inputting a number will run a different line of code.
        }
    }
    public void displayMenu()
    {
        System.out.println("\n 1. Add Song");
        System.out.println(" 2. Delete Song");
        System.out.println(" 3. Print All Songs");
        System.out.println(" 4. List Top Songs");
        System.out.println(" 5. Quit\n");

    }


        private void addSong()
    {
        System.out.println(" adding a song");
        String title = InputReader.getString("Please enter the song title >");
        String name = InputReader.getString("Please enter the artist name >");
        int count = InputReader.getInt("Please enter the play count >");

        Song song = new Song(title, name, count);
        songs.add(song); //This method allows the user to import their own song with their own set of data.
    }

    private void deleteSong()
    {   
        printSongs();
        Song song = findSong();
        if(song != null)
        {
            songs.remove(song);
        }
        else System.out.println("Song could not be found");
        printSongs();        
    } // This allows a song to be deleted from the array. It uses the findSong function to locate the song through input.

    private Song findSong()
    {
        String deleteSong = InputReader.getString("Please type a song you would like to delete >");
        for(Song song : songs)
        {
            if(song.getTitle().contains(deleteSong))
                return song;
        }
        return null;
    } // the findSong function uses the phrase inputted by the user to locate a song in the array.

    private void printSongs()
    {
        System.out.println("\nPrinting All Songs\n");

        for(Song song : songs)
        {
            song.print();
        }
    }
    private void topSongs()
    {
       
        }

    private void addSomeSongs()
    {
        Song song = new Song("Coast", "Hailee Steinfeld", 23421);
        
        songs.add(song);

        song = new Song("Japan", "Throttle", 17395120);
        songs.add(song);
    }
}