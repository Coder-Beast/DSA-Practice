//Alpha-Triangle Pattern
//Problem Link : https://takeuforward.org/pattern/pattern-18-alpha-triangle-pattern

class Pattern18{
    

    static void pat18(int n){
        char ch =(char) ('A'+n-1);
        for (int i = 1; i <= n; i++) {
            char startChar = ch;
            for(int j = 1; j<= i;j++){// striver's Solution: (char ch = (char) ('A' + N - 1 - i); ch <= (char) ('A' + N - 1); ch++)
                System.out.print(startChar);
                startChar++;
            }
            ch--;
            System.out.println();
        }
    }

    
    public static void main(String[] args) {
        int n = 5;
        pat18(n);
    }
}