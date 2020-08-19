package Java_Programs;

public class Merge_2_Sorted_Revise {

    public static void main (String[] args) {

        int a[] = {2, 5, 6, 7, 9};
        int b[] = {1,3,8,9};
        int c[] = new int[a.length+b.length];
        int i=0; int j=0; int k=0;
        while (i<a.length && j<b.length)
        {
         if (a[i]<b[j])
         {
             c[k] = a[i];
             i++;
         } else {c[k]=b[j]; j++;}
        k++;}
         while(i<a.length)
         {
             c[k]=a[i];
             i++; k++;
         }
        while(j<b.length)
        {
            c[k]=b[j];
            j++; k++;
        }
        for (int e=0;e<c.length;e++)
        {
            System.out.print (c[e]+" ");
        }
    }
}
