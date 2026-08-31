//Increasing Letter Triangle Pattern
//Problem Link : https://takeuforward.org/pattern/pattern-14-increasing-letter-triangle-pattern

import java.util.Map;
import static java.util.Map.entry;


class Pattern14{
    

    static void pat14optimized(int n){
        for(int i = 0 ; i<n; i++){
            for(char c = 'A'; c <='A' + i; c++){
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    // i dint knew java could do this automatically
    static void pat14(int n){
        Map<Integer,Character> alphaNumericMap = Map.ofEntries(
            entry(1,'A'),
            entry(2,'B'),
            entry(3,'C'),
            entry(4,'E'),
            entry(5,'F'),
            entry(6,'G'),
            entry(7,'H')

        );
        for(int i = 1 ; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(alphaNumericMap.get(j));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 6;
        pat14optimized(n);
    }
}