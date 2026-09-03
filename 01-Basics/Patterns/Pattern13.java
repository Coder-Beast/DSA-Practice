package Patterns;
//Increasing Number Triangle Pattern
//Problem Link : https://takeuforward.org/pattern/pattern-13-increasing-number-triangle-pattern

class Pattern13{
    
    static void pat13(int n){
        int curNum = 1;
        for(int i = 1 ; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(curNum++ + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 6;
        pat13(n);
    }
}