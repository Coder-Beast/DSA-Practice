package Patterns;
//Binary Number Triangle Pattern 
//Problem Link : https://takeuforward.org/pattern/pattern-11-binary-number-triangle-pattern
class Pattern11{

    static void pat11(int n){
        
        for(int i = 1 ; i<=n; i++){
            boolean b ;
            
            //this is important but works wonders
            if(i%2 == 0) b = false;
            else b = true;


            for (int j = 1; j <=i; j++){
                System.out.print(b ? 1 : 0);
                b = !b;
            }
            
            System.out.println();
            
        }
    }


    public static void main(String[] args) {
        int n = 5;
        pat11(n);
    }
}