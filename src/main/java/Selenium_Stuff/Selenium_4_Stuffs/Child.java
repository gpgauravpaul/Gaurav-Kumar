package Selenium_Stuff.Selenium_4_Stuffs;


public class Child extends Parent{

    public static void main (String[] args) {

        Parent p = new Parent();



        Child q = new Child();
        q.simple();
        q.child1 ();

        Parent r = new Child();


    }

    public void child1()
    {
        System.out.println ("Child1");
    }
    public void simple()
    {
        System.out.println ("Child2Simple");
    }

}
