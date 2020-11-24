import java.io.File;
import java.io.FileNotFoundException;

public class Exceptional_handling {


    public static void main (String[] args) {

        int a=0;
        try {
            a = 2/0;
            Thread.sleep (3000);
            File file = new File ("path");
        }

        catch (InterruptedException b)
        {
            System.out.println ("Interrupted"+b.getMessage ());
        }
        catch (ArithmeticException e)
        {
            System.out.println ("Arithmetic"+e.getMessage ());
        }
    }
}
