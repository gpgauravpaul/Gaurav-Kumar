package CustomException;

public class Checked extends Exception {

    Checked()
    {
        super("Your salary is too high.");
    }

    Checked(String custom)
    {
        super(custom);
    }
}
class complieTime extends Checked
{
    static int salary = 100000;
    public static void main (String[] args) {
        try {
            if (salary > 90000) {
                throw new Checked ();
            }
        }
     catch(Exception e)
     {
         e.printStackTrace ();
     }
    }
}