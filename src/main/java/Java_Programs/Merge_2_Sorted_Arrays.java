package Java_Programs;
public class Merge_2_Sorted_Arrays {
public static void main (String[] args) {
int a[] = {2,4,5};
int b[] = {1,3,6,7,8};
int i=0; int j=0; int k=0;
int c[] = new int[a.length+b.length];

while (i<a.length && j<b.length)
{
if(a[i]>b[j])
{
    c[k]=b[j];j++; }
else
    { c[k]=a[i];i++;}
k++;}
while(i<a.length)
{ c[k] = a[i];i++; }
while(j<b.length) { c[k] = b[j];j++; k++; }

for(int q=0;q<c.length;q++)
{ System.out.println (c[q]);
}}}
