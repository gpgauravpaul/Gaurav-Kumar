package HashMap;
import java.util.*;
import static java.util.Map.*;
public class SetToHash {

    public static void main (String[] args) {

int j=0;
HashMap<Integer,Integer> map = new HashMap<> ();
        map.put (1,4);
        map.put (2,6);
        map.put (3,5);
        map.put (4,8);
        map.put (5,9);


//COnversion from Hash to Set
   Set s = map.entrySet ();
   Iterator i  = s.iterator ();

while (i.hasNext ())
{
    Entry<Integer,Integer> e = (Entry<Integer, Integer>) i.next ();
    System.out.println (e.getKey());
    j++;
}

    }
}
