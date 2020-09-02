package Java_Programs;

import java.util.Collections;
import java.util.HashMap;

public class Cha_Occurence_Hashmap {

    public static void main (String[] args) {

        Character ch[] = {'a','b','c','b','c','a','c','b','c'};
        int count = ch.length;
        HashMap<Character,Integer> map = new HashMap<>();

        for (int i=0;i<count;i++)
        {
         if(!map.containsKey (ch[i]))
         {
             map.put (ch[i],1);
         }
          else
         {
             map.put (ch[i],map.get (ch[i])+1);
         }
        }



    }
}
