package Selenium_Stuff.Selenium_4_Stuffs.Constructor;

import java.lang.reflect.ParameterizedType;

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
