import helpers.InputReader;

public class program 
{
    public static final String CONSOLE_CLEAR = "\033[H\033[2J";
    public static void main(String[] args) 
    {
        String name;
        System.out.println("Hello, what's your name? ");
        name = InputReader.getString();
        System.out.println("Hello" + name + "!");
    }
}