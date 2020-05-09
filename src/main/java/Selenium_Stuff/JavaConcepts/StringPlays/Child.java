package Selenium_Stuff.JavaConcepts.StringPlays;

public class Child  {

     int q=323;

    public static void main (String[] args) {

        String a = "Gaurav";
       a =  a.concat (" is a person");
            a =   a.substring (2);
            System.out.println (a);

        StringBuffer b = new StringBuffer ("Gaurav Kumar");
        StringBuilder c = new StringBuilder ("TechWorld");
        c.deleteCharAt (3);
        System.out.println (c);
        int q = 45;
        System.out.println (q);
        q = 33;
        System.out.println (q);
    }

        public void test1()
    {
      System.out.println (q);
    }
    }

