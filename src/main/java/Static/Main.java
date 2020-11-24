package Static;

public class Main {

     int a=0;
    public static void main (String[] args) {

        child c1 = new child();
        c1.b ();
        parent c = new child();
     c.b ();
     parent p = new parent();
     p.b ();
     child.b ();
     parent.b ();





    }
}
