public class substring {
    public static String sub(String str,int st,int ed){
        String substr = "";
        for(int i=st;i<ed;i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args){
        String str="HelloWorld";
        System.out.println(str.substring(0, 6));
        //System.out.println(sub(str,0,3));

    }
}
