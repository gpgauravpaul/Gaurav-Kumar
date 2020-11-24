import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Duplicacy_with_Hasgmap {

    public static void main (String[] args) {
        ArrayList list = new ArrayList();
        HashMap<Integer,Integer> map = new HashMap<>();
        int a[]= {1,3,4,5,6,7,2};
        int count = a.length;

        for(int i=0;i<count;i++)
        {
          if (!map.containsKey (a[i]))
          {
              map.put (a[i],1);
          }
          else
          {
              map.put (a[i],map.get (a[i])+1);
          }
        }
        int j=0;
        while (j<count)
        {
            if(map.get (a[j])==1)
            {
              list.add (a[j]);
            }
        j++;
        }
        System.out.println (list);
    }
}
