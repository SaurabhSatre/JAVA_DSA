//parent class to derived class all herarki single-level inhertance 
public class Inheritance {
    public static void main(String[] args){
        Fish s1= new Fish(); // this is object of fish
        s1.eat();    //s1 is fish object eat is parent class funtion ,,,it is connection of parent to child  
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
class Fish extends Animal{      //child class/derived class
    int fins;
    void swim(){
        System.out.println("Swemming");
    }

}
