package CW1;
import helpers.*;
import java.util.ArrayList;

/**This class allows the user to
 * 
 * Add songs to a list.
 * Remove songs from a list.
 * View the list
 * Display the top songs
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
                case 3: printSongs(0);break;
                case 4: topSongs();
                case 5: wantToQuit = true; break;
            }//Based on user input, this method will fetch the code required to complete the method.
        }
    }
    public void displayMenu()
    {
        System.out.println("\n 1. Add Song");
        System.out.println(" 2. Delete Song");
        System.out.println(" 3. Print All Songs");
        System.out.println(" 4. List Top Songs");
        System.out.println(" 5. Quit\n");
        
        //This is the different options displayed n the menu. The user will see these sets of options.
    }


        private void addSong()
    {
        System.out.println(" Adding a song...");
        String title = InputReader.getString("Please enter the song title >");
        String name = InputReader.getString("Please enter the artist name >");
        int count = InputReader.getInt("Please enter the play count >");

        Song song = new Song(title, name, count);
        songs.add(song); //This method allows the user to import their own song with their own set of data.
    }

    private void deleteSong()
    {   
        printSongs(0);
        Song song = findSong();
        if(song != null)
        {
            songs.remove(song);
        }
        else System.out.println("Song could not be found");
        printSongs(0);        
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

    private void printSongs(int count)
    {
        System.out.println("\nPrinting All Songs\n");

        for(Song song : songs)
        {
            if(song.getPlayCount()>count)
                song.print();
        } //This is used along with the topSongs method. It uses the input to calculate which songs have a greater play count than the inputted number.
    }
    private void topSongs()
    {
        int countAnswer = InputReader.getInt("Enter a playcount. The songs above that playcount will be displayed. >");
        printSongs(countAnswer);

        //The user will enter a number and the app will check to see which songs the list have a greater number than the one inputted.

        }

    private void addSomeSongs()
    {
        Song song = new Song("Coast", "Hailee Steinfeld", 35969416);
        songs.add(song);

        song = new Song("Japan", "Throttle", 17395120);
        songs.add(song);

        song = new Song("Clarity", "Zedd", 454551028);
        songs.add(song);

        song = new Song("Paradise City", "Guns N' Roses", 807383102);
        songs.add(song);

        song = new Song("Obsessed With You", "Central Cee", 181425719);
        songs.add(song);

        song = new Song("STAR WALKIN'", "Lil Nax X", 84573502);
        songs.add(song);

        song = new Song("Love Story", "Taylor Swift", 619492413);
        songs.add(song);

        song = new Song("Good 4 U", "Olivia Rodrigo", 1650436609);
        songs.add(song);

        song = new Song("Lose", "KSI", 57848750);
        songs.add(song);

        song = new Song("Seventeen Going Under", "Sam Fender", 128596479);
        songs.add(song);

        // This is a method used to add songs to the array. Instead of having to input them each time, these will always be put into the list.
    }
}