package CW1;


public class Program 
{
    public static void main(String[] args) 
    {
        System.out.println("==================");
        System.out.println("CW1 Song List");
        System.out.println("==================");
        System.out.println();
        System.out.println("by Lewis Broad");

        SongList songList = new SongList();
        songList.doMainMenu();
    } //This will display the main menu and is the backbone of the app.
}