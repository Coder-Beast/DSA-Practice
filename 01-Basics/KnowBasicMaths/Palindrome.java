package KnowBasicMaths;

public class Palindrome{

    
    public static boolean Solution(int n){
        
        int rev = 0;
        int org = n;
        int length= 0 ;
        length += (int)(Math.log10(n) +1);
        
        for (int i = 0; i < length; i++) {
            int lastdigit = n%10;
            rev = rev * 10+lastdigit;
            n/=10;
        }
        return rev == org;

    }
    
    public static void main(String[] args) {
        int n = 1551;
        System.out.print("Number " + n);
        boolean isPalindrome = Solution(n);
        if(isPalindrome)
            System.out.println(" is a Palindrome Number");
        else
            System.out.println(" is Not a Palindrome Number");
    }
}

