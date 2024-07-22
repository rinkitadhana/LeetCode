package ReverseInteger;
import java.lang.Math;

public class ReverseInteger {
    public static int reverse(int x) {
        int num = Math.abs(x);
        int reversedNumber=0;
        while(x!=0){
            int rem = num%10;
            if(reversedNumber>(Integer.MAX_VALUE-rem)/10) return 0;
            reversedNumber = reversedNumber*10 + rem;
            x/=10;
        }
        return x<0? -reversedNumber : reversedNumber;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));

    }
}
