import java.util.ArrayList;
import java.util.List;

public class Welcome {

    public static String message="Welcome to Java.";

    public static void printMessage()
    {
        List<String> getMessage = addMessage(5);
        for(int i = 0; i<getMessage.size(); i++)
        {
            System.out.println(getMessage);
        }
    }

    public static List<String> addMessage(int times)
    {
        List<String> getMessage = new ArrayList<>();

        for(int i = 0; i<times; i++)
        {
            getMessage.add(message);
        }

        return getMessage;
    }


    public static void main(String args[])
    {
        System.out.println("Welcome to Computer Science."+" Programming is fun.");
        printMessage();
    }

}
