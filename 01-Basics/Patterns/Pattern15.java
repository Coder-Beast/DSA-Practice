package Patterns;
//Reverse Letter Triangle Pattern
//Problem Link : https://takeuforward.org/pattern/pattern-15-reverse-letter-triangle-pattern


class Pattern15{
    

    static void pat15(int n){
        for(int i = n ; i>=0; i--){
            for(char c = 'A'; c <='A' + i; c++){// striver used 'A' + (N - i - 1)
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    
    public static void main(String[] args) {
        int n = 6;
        pat15(n);
    }
}