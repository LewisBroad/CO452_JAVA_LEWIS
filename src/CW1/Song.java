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
        
    
    }
    public void print()
    {
        System.out.println(title + " - " + artist + " " + playCount);

    }
    public void remove(Song song) {
    }

    public String getTitle()
    {
        return title;
    }


}