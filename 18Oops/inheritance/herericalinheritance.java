//hererchical inheritance 
public class herericalinheritance {
        public static void main(String[] args){
            Birds crow = new Birds();
            crow.eat();
            crow.fly();
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
       void walk(){
        System.out.println("walk");
       }

    }
    class Birds extends Animal {
        void fly(){
            System.out.println("Birds fly");
        }
    }

