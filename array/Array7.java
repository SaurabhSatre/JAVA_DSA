//maximum Sub Array Sum prefix Array
public class Array7 {
    public static void maxsubarraysum(int number[])
    {
        int currsum = 0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]= new int[number.length];

        prefix[0] = number[0];
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + number[i];
        }//aaddtion of all sub array

        for(int i=0;i<number.length;i++){
            int start = i;
            for(int j=i;j<number.length;j++){
                int end = j;
                currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1]; //just maximum number print
              
              if(maxsum < currsum){
                maxsum = currsum;
              }
            }
        }
        System.out.println("Max sum is : "+maxsum);
    }
    public static void main(String args[])
    {
        int number[] = {2,4,3,-8,5};
        maxsubarraysum(number);
    }
    
}
