public class hollorectanglepattern1 {
    public static void hollo(int totRows,int totcol)
    {
        for(int i=1;i<=totRows;i++)
        {
            for(int j=1;j<=totcol;j++)
            {
                if(i==1 || i==totRows || j==1 || j==totcol)// this is like or condition one condition satisfies then print
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    } 
    public static void inverted_roteted_half_paramed(int n)
    {
        for(int i=1;i<=n;i++)
        {
            //spaces
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }//stars
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void inverted_half_paramed(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    } 
    public static void floyds_trangle(int n){
        int counter=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void trianglepattern_zero_one(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
               if( (i+j) % 2 == 0) { //even
                    System.out.print("1");
               }
               else{
                    System.out.print("0");
               }
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        hollo(4, 5);
        //inverted_roteted_half_paramed(5);
        //inverted_half_paramed(4);
        //floyds_trangle(5);
       // trianglepattern_zero_one(5);
    }
}
