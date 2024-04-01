import java.util.*;
public class tax {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your income to calculate a tax : ");
        int a = sc.nextInt();
        int tax;
        if(a<500000){
            tax=0;
        }
        else if(a>=500000 && a<1000000){
            tax = (int) (a*0.2);
        }
        else{
            tax = (int) (a*0.3);
        }
         System.out.println("Your tax is : "+tax);
    }
}
