public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // methods
    // remove
    // add

    public void addFirst(int data) {
        // step1 = create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // newNode next = head
        newNode.next = head;

        // step3- head = newNode
        head = newNode;
    }

    public void addLast(int data) {
        // step1 = create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();

    }

    // Add new value in middle
    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    //removeFirt is function
    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }
        else if (size == 1){
            int val = head.data;
            head = tail = null;
            return val;  
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    //REMOVE LAST
    public int removeLast(){
        if(size == 0){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }
        else if (size == 1){
            int val = head.data;
            head = tail = null;
            size=0;
            return val;  
        }
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int itrSearch(int key){
        Node temp = head;
        int i=0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int helper(Node head,int key){
        //recursive search
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }

    public int recSearch(int key){
        //recursive search
        return helper(head, key);
    }

    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteNthfromEnd(int n){
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;

        }
        if(n == sz){
            head = head.next;
            return;
        }

        int i=1;
        int iTofind = sz-n;
        Node prev = head;
        while(i<iTofind){
            prev =prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        Node midNode = findMid(head);
        Node prev = null;
        Node curr = midNode;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev =curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;

        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left =left.next;
            right =right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
       // add in middle element

        //System.out.println(ll.size);
        
        // ll.removeFirst();
        // ll.print();

        // ll.removeLast();
        // ll.print();

        //System.out.println(ll.size);
        // System.out.println(ll.itrSearch(2));

        // System.out.println(ll.recSearch(2));
        // System.out.println(ll.recSearch(10));

        // ll.print();
        // ll.reverse();
        // ll.print();

        
        // ll.print();
        // ll.deleteNthfromEnd(5);
        // ll.print();
       
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(5);
        ll.addLast(4);
        ll.print();
        System.out.println(ll.checkPalindrome());

    }

}
