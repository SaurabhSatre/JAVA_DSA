import java.util.LinkedList;
public class LisklistCollection {
    public static void main(String args[]){
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addLast(8);
        ll.addLast(9);
        ll.addFirst(1);
        ll.addFirst(2);
        
        System.out.println("This is Linklist :-"+ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
}
