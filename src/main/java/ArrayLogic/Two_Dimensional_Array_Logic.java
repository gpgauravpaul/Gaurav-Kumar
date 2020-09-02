package ArrayLogic;
public class Two_Dimensional_Array_Logic {

    public static void main (String[] args)
    {
        int row = 0;
        int column=0;
    int a[][] = {{4,4,2},{8,4,10},{9,233,3}};
    int count =a.length;
    int min=a[0][0];
    for (int i=0;i<count;i++)
    { for (int j=0;j<count;j++) {
     if(min>a[i][j])
     {
      min = a[i][j];
      row = i;
      column = j;
     } } }
    System.out.println (min);
    System.out.println ("Row index "+row);
    System.out.println ("Column index "+column);
    int max = a[0][0];
    for (int k=0;k<count;k++)
    {
    if(max<a[k][column])
    {
        max = a[k][column];
    }}
    System.out.println (max);
    }}