//Super keyword Animal constractor and Horse extend are print automatically
public class superkey {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.colour);
    }
}
class Animal{
    String colour;
    Animal(){
        System.out.println("Animal Constractor is called ");
    }
}
class Horse extends Animal{

    Horse(){
        super.colour="brown";
        System.out.println("Horse constractor is called");
    }

}