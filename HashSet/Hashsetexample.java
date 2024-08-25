import java.util.HashMap;
import java.util.*;

public class Hashsetexample {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(1);
        set.add(3);

        System.out.println("set Size is :- "+set.size());

        if(set.contains(1)){
            System.out.println("set conatin 1");
        }
        if(!set.contains(6)){
            System.out.println("set Does not conatin 6");
        }
        
        //Delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("set Not conatin 1");
        }

        Iterator it = set.iterator();

        while(it..hasNext()){
           System.out.println(it.next()); 
        }
    }
}
