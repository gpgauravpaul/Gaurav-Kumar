package Static_Interface.Lambda;

public class BaseClass implements interface32 {

    public static void main (String[] args)
    {
        BaseClass d = new BaseClass();
        d.unimplemented ();
    }
    @Override
    public void unimplemented () {
        System.out.println ("i love m india");
    }
}