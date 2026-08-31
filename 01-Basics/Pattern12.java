
//Problem Link : https://takeuforward.org/pattern/pattern-12-number-crown-pattern
class Pattern12{

    static void pat11(int n){
        
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
    //this is damn correct formulaaaaa
    static void pat11optimized(int n){
        
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
    void striversSolution(int n){
        // Function to print the pattern
    
        // Initial number of spaces in the first row
        int spaces = 2 * (n - 1);

        // Outer loop for the number of rows
        for (int i = 1; i <= n; i++) {
            
            // Inner loop to print numbers in increasing order
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            
            // Inner loop to print spaces in the middle
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            
            // Inner loop to print numbers in decreasing order
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            
            // Move to the next line after printing the row
            System.out.println();
            
            // Decrease spaces by 2 after each row
            spaces -= 2;
        }
    }

    

    public static void main(String[] args) {
        int n = 3;
        //pat11(n);
        pat11optimized(n);
    }
}