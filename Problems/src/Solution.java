import java.util.Scanner;
public class Solution {
    public static boolean checkPrime(int num){
        int count =0;
        for(int i=1; i*i<=num; i++){
            if(num%i==0){
                count++;
                if((num/i)!=i) count++;
            }
        }
        return (count==2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(checkPrime(num));

    }

}