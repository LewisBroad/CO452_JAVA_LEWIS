package CW1;

public class Song 
{
    
    private String title; 

    private String artist;

    private int playCount;

    public Song(String title, String name, int count) 
    {
        this.title = title;
        this.artist = name;
        this.playCount = count;
        //This is used to make the strings more clear in definintion.
    
    }
    public void print()
    {
        System.out.println(title + " - " + artist + " |" + playCount);
        // The format in which the songs are displayed in the terminal
    }
    public void remove(Song song) {
    }

    public String getTitle()
    {
        return title;
    }

       public int getPlayCount() {
        return playCount;
    }
   

}
