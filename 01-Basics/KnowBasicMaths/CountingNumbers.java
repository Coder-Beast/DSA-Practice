package KnowBasicMaths;

public class CountingNumbers {
    public static int countDigits(int num){
        int count = 0;
        while(num>0){
            count+=1;
            num = num/10;
        }
        return count;
    }
    public static int countDigitsOptimized(int num){
        int count = 0;
            count+= (int) (Math.log10(num) + 1);
       
        return count;
    }
    public static void main(String[] args) {
        int n = 8232;
        System.out.println("N:" + n);
        //int c = countDigits(n);
        int c = countDigitsOptimized(n);
        System.out.println("Count of Digits: " + c);
    }
}

