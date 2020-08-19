package Static_Interface;
public class ABC implements Static_Interface {

    public static void main (String[] args) {

   ABC a = new ABC();
   a.m11 ();
   a.m1 ();
   Static_Interface.m1 ();

    }
    private void m1 ()
    {
        System.out.println ("m1 Class wali method");
    }

    @Override
    public void m2 () {
        System.out.println ("Override M2");
    }

    public void m11()
    {
System.out.println ("m2");
    }

}
