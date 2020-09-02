public class Descending_Star_logic {

    public static void main (String[] args) {
        int count = 5;
        for(int i=0;i<count;i++)
        {
            for (int j=0;j<count-i;j++)
            {
                System.out.print("* "+" ");
            }
            System.out.println("\n");
        }
    }
}
