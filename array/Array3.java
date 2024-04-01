//minimum & maximum value of number using Array
import java.util.*;
public class Array3 {
    
    public static int getmax(int number[]){
        int largest = Integer.MIN_VALUE; //integer chi minimum value check
        int smallest = Integer.MAX_VALUE;  //integer chi maximum value check
        for(int i=0;i<number.length;i++){
            if(largest<number[i]){
                largest=number[i];
            }
            if(smallest>number[i]){
                smallest = number[i];
            }
        }
        System.out.println("smallest number is : "+smallest);
        return largest;
    }
    public static void main(String args[]){

        int number[] = {5,6,9,8,98,52,3,56,7,987,51};
        System.out.println("The Largest vales of Array is : "+getmax(number));

    }
}
