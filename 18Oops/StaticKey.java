//Static means fix values of functions 
public class StaticKey {
    public static void main(String[] args) {
        student s1 = new student();
        s1.Schoolname="new english schol";
        System.out.println(s1.Schoolname);
        
        student s2 = new student();
        System.out.println(s2.Schoolname);


    }
}
class student{
    String name;
    int roll;

    static String Schoolname;

    void setname(String name){
        this.name = name;

    }
    String getname(){
        return this.name;
    }
}
