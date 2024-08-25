// abstract and non absract functions
public class Abstractclass {
    public static void main(String[] args) {
        //Horse h = new Horse();
        //h.eat();
        //h.walk();
        Chicken c = new Chicken();
       // c.eat();
       c.walk();
    //    Mustang c = new Mustang();
    }
}

abstract class Animal{
    String color;
    Animal(){
        System.out.println("animal constracor called");
    }


    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse Constractor Called");
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang Constractor called");
    }
}

class Chicken extends Animal{
    void walk(){
        System.out.println("walks on 2 legs");
    }
}