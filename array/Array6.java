//maximum Sub Array Sum time complexity is(n3cube) it is very high
public class Array6 {
    public static void maxsubarraysum(int number[])
    {
        int currsum = 0;
        int maxsum=Integer.MIN_VALUE;

        for(int i=0;i<number.length;i++){
            int start = i;
            for(int j=i;j<number.length;j++){
                int end = j;
                currsum = 0;

              for(int k=start;k<=end;k++){
                currsum += number[k];
              }
              System.out.println(currsum);
              
              if(maxsum < currsum){
                maxsum = currsum;
              }
            }
        }
        System.out.println("Max sum is : "+maxsum);
    }
    public static void main(String args[])
    {
        int number[] = {2,4,3,8,5};
        maxsubarraysum(number);
    }
    
}
