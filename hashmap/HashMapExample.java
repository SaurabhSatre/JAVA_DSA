
import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 120);
        map.put("US", 120);
        map.put("London", 120);

        System.out.println(map); //it is provide unorder output

        if(map.containsKey("India")){
            System.out.println("key is present");
        }
        else{
            System.out.println("key is not present");
        }

        int arr[] = {11, 22, 33, 44};  
        for(int val:arr){
            System.out.print(val+" "); //it is like normal loop
        }

    }
}
