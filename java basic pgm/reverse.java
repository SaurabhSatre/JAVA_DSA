import java.util.*;
public class reverse {
    public static void main(String args[]){
       
        System.out.println("Enter the value : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;

        while(n > 0)
        {
            int lastdigit = n % 10;
            rev = (rev*10) + lastdigit;
            n = n/10;
        }
        System.out.println("The Reverse is : "+rev);

    }
    
}