package Selenium_Stuff.Selenium_4_Stuffs.Constructor;

public class FirstConceptOfConstructor {

    String a ;
    int b;

    FirstConceptOfConstructor (String a, int b)
    {
       this.a=a;
       this.b=b;
    }

    public static void main (String[] args) {

        FirstConceptOfConstructor m = new FirstConceptOfConstructor ("Gaurav",23);

        FirstConceptOfConstructor n = new FirstConceptOfConstructor ("Saurabh", 21);

        System.out.println (m.a+" "+m.b);
        System.out.println (n.a+" "+n.b);

    }



}
