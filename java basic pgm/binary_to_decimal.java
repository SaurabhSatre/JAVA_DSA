public class binary_to_decimal {

    public static void bintodec(int binum)
    {
        int mynum = binum;
        int pow = 0;
        int decnum = 0;
        while(binum > 0)
        {
            int lastdigit = binum % 10;
            decnum = decnum + (lastdigit * (int)Math.pow(2, pow));
            pow++;
            binum = binum/10;

        }
        System.out.println("decimal of :" + mynum +" = " + binum);
    }

    public static void main(String args[])
    {
       bintodec(1010);
    }
    
}
