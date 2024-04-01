
public class Constractor {
    public static void main(String[] args){
        student p1 = new student();
        student p2 = new student("saurabh");
        System.out.println(p2.name);
    }
}
class student{
    String name; 
    int roll;

student(){
    System.out.println("ssumit");
}

student(String name){
    this.name = name;
    
}

}
