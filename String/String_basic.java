
//firstly input and out from user then find length
import java.util.Scanner;

public class String_basic {

    public static void print(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");

        }
    }
    public static void main(String args[]){
        // char arr[]= {'a','b','c'};  // As a charaector
        // String str="abcd";
        // String str2 = new String("Saurabh");

        // Scanner sc=new Scanner(System.in);
        // String name;
        // name = sc.nextLine();

        // System.out.println(name);

        
        // String name="Saurabh satre";  //length of string
        // System.out.println(name.length());

        //concatination means jodna 
        String Firstname = "Saurabh";
        String lastname = "Satre";
        String Fullname = Firstname +" "+ lastname;
        print(Fullname);
    }
}
