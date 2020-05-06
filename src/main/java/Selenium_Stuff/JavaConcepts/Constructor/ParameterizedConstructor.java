package Selenium_Stuff.JavaConcepts.Constructor;

public class ParameterizedConstructor {

    String name;

    ParameterizedConstructor(String a)
    {
          this.name = a;

    }

    public static void main (String[] args) {

        ParameterizedConstructor p = new ParameterizedConstructor("Gaurav");

   System.out.println (p.name);


    }


}
