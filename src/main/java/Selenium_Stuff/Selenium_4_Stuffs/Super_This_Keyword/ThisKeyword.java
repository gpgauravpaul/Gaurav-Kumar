package Selenium_Stuff.Selenium_4_Stuffs.Super_This_Keyword;

public class ThisKeyword {

    public static void one (ThisKeyword a) throws InterruptedException
    {
        System.out.println ("One");
    }

    public void two () throws InterruptedException
    {
        System.out.println ("Two");
        one (this);
    }

    public static void main (String[] args) throws InterruptedException {

   ThisKeyword t = new ThisKeyword ();
    t.two ();

    }

}
