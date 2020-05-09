package Selenium_Stuff.JavaConcepts.Method_OverRidding;

public class Child extends Parent
{

    public void one() throws Exception, ArithmeticException
    {
        super.one();
        System.out.println ("TechWorld");
    }

    public void abstract1 () throws InterruptedException, Exception {
        System.out.println ("Method has been implemented.");
    }


    public static void main (String[] args) throws Exception {

 Parent p = new Child();
 p.abstract1 ();
 p.one ();

    }

}
