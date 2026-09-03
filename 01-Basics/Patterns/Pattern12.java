package Patterns;
//Number Crown Pattern
//Problem Link : https://takeuforward.org/pattern/pattern-12-number-crown-pattern
class Pattern12{
    
    //this is damn correct formulaaaaa
    static void pat12optimized(int n){
        
        for(int i = 1 ; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            for(int j = 0 ; j < 2 * n - (2*i); j++){
                System.out.print(" ");
            }
            for(int j = i; j>0; j--){
                System.out.print(j);
            }
            System.out.println();
            
        }
    }
    static void pat12(int n){
        
        for(int i = 1 ; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            for(int j = 0 ; j < 2 *n -( 2 * i +1); j++){
                System.out.print(" ");
            }
            for(int j = i; j>0; j--){
                System.out.print(j);
            }
            System.out.println();
            
        }
    }
    
    //#region Striversolution
    void striversSolution(int n){
        int spaces = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
            spaces -= 2;
        }
    }

    //#endregion

    public static void main(String[] args) {
        int n = 3;
        //pat11(n);
        pat12optimized(n);
    }
}