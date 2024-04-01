//Sub Array 2 to 10
public class Array5 {
    public static void printsubArray(int number[])
    {
        for(int i=0;i<number.length;i++){
            int start = i;
            for(int j=i;j<number.length;j++){
                int end = j;
              for(int k=start;k<=end;k++){
                System.out.print(number[k]+" ");
              }
             System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int number[] = {2,4,3,8,5};
        printsubArray(number);
    }
    
}
