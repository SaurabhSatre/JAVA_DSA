// it is second type multi level inheritance parent derived---> derived class 
public class Multilevel2inheritance {
    public static void main(String[] args){
        Dogs jerrey = new Dogs();
        jerrey.eat();
        jerrey.breed = 4;
       System.out.println(jerrey.breed);
    }
}
class Animal{ //parent class
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breaths(){
        System.out.println("Breaths"); 
    }
}
class Mammal extends Animal{
    String legs;
}
class Dogs extends Mammal{
    int breed;
}