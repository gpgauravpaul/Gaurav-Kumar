package ArrayLogic;

public class LeftRightMovement {

    static int counter =0;
    public static void main (String[] args) {

    int a[] = new int[10];
    a[0]= 0;
    a[1]= 1;
    a[2]= 0;
    a[3]= 1;
    a[4]= 0;
    a[5]= 1;
    a[6]= 0;
    a[7]= 1;
    a[8]= 0;
    a[9]= 0;

for (int i=0;i<a.length;i++)
{
if(a[i]==0)
{
    counter++;
}
}
for (int j=0;j<counter;j++)
{
    a[j] = 0;
}
int final1 = a.length - counter;

for(int k=counter;k<a.length;k++)
{
    a[k]=1;
}
for(int l=0;l<a.length;l++)
{
    System.out.println (a[l]);
}
}
}
