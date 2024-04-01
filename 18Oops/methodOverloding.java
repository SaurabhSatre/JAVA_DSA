public class methodOverloding {
    public static void main(String[] args){
        calculator sum=new calculator();
        System.out.println(sum.sum(4,5));
        System.out.println(sum.sum((float)5.5, (float)4.5));
        System.out.println(sum.sum(5, 6, 9));
    }
}
class calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b;
    }

}
