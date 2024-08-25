public class Example {

    public static void main(String[] args) {
        Best_Friend b = new Best_Friend(
            "Gulpreet Kaur", 21, "BIT MESRA", "M.TECH",
            "Kiriburu");
 
        // Print and display commands to illustrate 
        // toString() method as both will print the same 
        // Print the object
        System.out.println(b);
        // Print the object but implicitly using toString()
        // method
        System.out.println(b.toString());

    
    }
}
public class Best_Friend {
    String name;
    int age;
    String college;
    String course;
    String address;
 
    // Constructor of this class
    Best_Friend(String name, int age, String college,
                String course, String address) {
        // This variable refers to current instance itself
        this.name = name;
        this.age = age;
        this.college = college;
        this.course = course;
        this.address = address;
    }
}
