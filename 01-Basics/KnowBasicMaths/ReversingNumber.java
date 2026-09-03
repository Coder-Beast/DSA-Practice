package KnowBasicMaths;

public class ReversingNumber{

    
    public static int reverseNumber(int n){
        
        int rev =0;
        while(n > 0){
            int lastdigit = n%10;

            rev = rev*10 +lastdigit;

            n/=10;
        }
        return rev;
    }
    
    public static void main(String[] args) {
        int n = 123;
        System.out.println("N:" + n);
        System.out.println("Reverse Number: " +reverseNumber(n)); 
    }
}

