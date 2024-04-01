public class ithbit {
public static int getbit(int n,int i){
    int bitmask=1<<i;
    if((n & bitmask)==0){
       return 0;
    }
    else{
         return 1;
    }
}
public static int setbit(int n,int i){
   int bitmask = 1<<i;
   return n | bitmask;
}
public static int updatebit(int n,int i,int newbit){
   n = clearbeat(n,i);
   int bitmask = newbit<<i;
   return n | bitmask;

}
public static int clearbeat(int n,int i){
   int bitmask = ~(1<<i);
   return n & bitmask;
}
public static int clearlastbeat(int n,int i){
   int bitmask = (~0)<<i;
   return n & bitmask;
}
public static int clearbitrange(int n,int i,int j){
   int a = ((~0)<<(j+i));
   int b = (1<<i)-1;
   int bitmask = a|b;
   return n & bitmask;
}

public static void main(String[] args){
  // System.out.println(setbit(6, 2));
  //System.out.println(clearbeat(10, 1));
 // System.out.println(updatebit(10,2,1));
 //System.out.println(clearlastbeat(15,2));
 System.out.println(clearbitrange(10,2,4));
}
    
}
