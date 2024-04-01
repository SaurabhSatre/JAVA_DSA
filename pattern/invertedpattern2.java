import java.util.*;
public class invertedpattern2 {
    public static void main(String args[]){
    System.out.println("Enter number of line : ");
    Scanner sc = new Scanner(System.in);
    int a= sc.nextInt();

    for(int i=1;i<=a;i++){
        for(int j=1;j<=a-i+1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
}


