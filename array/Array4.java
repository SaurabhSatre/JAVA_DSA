//using array reverse number
import java.util.*;
public class Array4 {
    public static void reverse(int number[]){
        int first=0, last=number.length-1;
        while(first<last)
        {
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;

            first++;
            last--;

        }
    }
    public static void main(String args[]){
        int number[] = {4,5,6,7,8,9};

        reverse(number);
        for(int i=0;i<=number.length;i++){
            System.out.print(number[i]+" ");
        }
        System.out.println();
    }
    
}
