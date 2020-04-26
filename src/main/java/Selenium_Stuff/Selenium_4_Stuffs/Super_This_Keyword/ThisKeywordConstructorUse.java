package Selenium_Stuff.Selenium_4_Stuffs.Super_This_Keyword;

public class ThisKeywordConstructorUse {

    String a;
    ThisKeywordConstructorUse()
    {
        System.out.println ("I love coding");
    }
    ThisKeywordConstructorUse(String a)
    {
        this();
        this.a = a;
    }

    public static void main (String[] args) {

        ThisKeywordConstructorUse b = new ThisKeywordConstructorUse("Gaurav");
        System.out.println (b.a);



    }

}
