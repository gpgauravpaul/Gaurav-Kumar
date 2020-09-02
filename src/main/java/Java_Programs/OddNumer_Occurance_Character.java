package Java_Programs;

import java.util.HashMap;

public class OddNumer_Occurance_Character { // Find the character occurring Odd number of times example <a, b, c, b, c, a, c} = c
    public static void main (String[] args) {
    Character ch[] = {'a','b','c','b','c','a','c','b'};
    int count = ch.length;
    HashMap<Character,Integer> map = new HashMap<>();
    for (int i=0;i<count;i++) {
        int counter =0;
        for (int j=0;j<count;j++)
       {
   if(ch[i]==ch[j])
   {
    counter=counter +1;
   } }
        if(counter%3==0)
        {
            map.put (ch[i],counter);
        } }
 System.out.println (map.keySet ());
    }
}
