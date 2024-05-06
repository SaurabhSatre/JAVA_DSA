import java.util.*;
public class factorial {
    public static void mian(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int fact=0;
        for(int i=0;i<=n;i++){
            fact = fact*i;
        }
        System.out.println("Factorial"+fact);
    }
}
