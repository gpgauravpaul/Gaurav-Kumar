package CustomException;

public class Unchecked extends RuntimeException
{
Unchecked()
{
    super("Symonds Go back");
}
    Unchecked(String str)
    {
super(str);
    }
}
class Runtime
{
    public static void main (String[] args) {
        int age=56;
       try{
        if(age<60)
        {
            throw new Unchecked();
        }}
       catch(Exception e)
       {
           e.printStackTrace ();
       }
    }
}
