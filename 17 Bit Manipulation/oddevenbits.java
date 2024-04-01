public class oddevenbits {
    public static void oddeven(int N){
        int bitmask = 1;
        if((N & bitmask) == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }  
    public static void main(String[] args){
        oddeven(5);
        oddeven(4);
    }
}
