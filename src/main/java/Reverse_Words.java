public class Reverse_Words {

    public static void main (String[] args) {
 String Final="";
        String name = "My name is Gaurav Kumar";

        String word[] = name.split (" ");
        for(String str:word)
        {
          int count = str.length ();
            String reverse = "";
         for(int i=count-1;i>=0;i--)
         {

             reverse = reverse +str.charAt (i);
         }
         Final = Final + " "+ reverse;
        }
System.out.println (Final);
    }
}
