//Alpha-Hill Pattern
//Problem Link : https://takeuforward.org/pattern/pattern-17-alpha-hill-pattern

class Pattern18{
    

    static void pat17(int n){
        char ch =(char) ('A'+n-1);
        for (int i = 1; i <= n; i++) {
            char outChar = ch;
            for(int j = 1; j<= i;j++){
                System.out.print(outChar);
                outChar++;
            }
            ch--;
            System.out.println();
        }
    }

    
    public static void main(String[] args) {
        int n = 5;
        pat17(n);
    }
}