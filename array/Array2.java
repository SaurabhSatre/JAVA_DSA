// linear search Array 
import java.util.*;
public class Array2 {
    public static int linearsearch(int number[],int key)
    {
        for(int i=0;i<number.length;i++){
            if(number[i] == key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        int number[] = {2,5,9,10,5,11,95,6,5,4};
        int key=95;
        int index = linearsearch(number, key);
        if(index == -1){
            System.out.println("Not Fount");
        }
        else{
            System.out.println("Key at inDex : "+index);
        }
        
    }
    
}
