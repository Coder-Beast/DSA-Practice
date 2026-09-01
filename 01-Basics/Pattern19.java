
//Problem Link : https://takeuforward.org/pattern/pattern-19-symmetric-void-pattern

import java.util.ArrayDeque;
import java.util.Deque;

class Pattern19{
    
    // this approach is based on using stack to print out the 2nd half the pattern using stack.
    static void pat19Stack(int n){
         int gap=0;
        int  b = n;
        Deque<String> upperStack = new ArrayDeque<>();
        
        for (int i = 1; i < n*2; i++) {
            if(i <= n ){
                
                StringBuilder curOutStrB =new StringBuilder(); 
                for(int j = 1; j<= b;j++){
                    
                    System.out.print("*");
                    curOutStrB.append("*");
                }
                for(int j = 0; j< gap;j++){
                    System.out.print(" ");
                    curOutStrB.append(" ");
                }
                for(int j = 1; j<= b;j++){
                    System.out.print("*");
                    curOutStrB.append("*");
                }
                    gap+=2;
                    b-=1;
                    curOutStrB.append("\n");
                upperStack.push(curOutStrB.toString());
                System.out.println();
            
            }else{
                for (int j = 0; j < upperStack.size(); j++) 
                {
                    System.out.print( upperStack.pop());
                }
            }
            
        }
        
        
    }
    //this is the first attempt but it fails at the reversal point and forms pattern like this(n=3)
    // ******
    // **  **
    // *    *
    // **  **
    // ******
    // ********
    static void pat19Partial(int n){
        
        int a=0;
        int  b = n;

        
        for (int i = 1; i <= n*2; i++) {
            int gap = a;
            
            for(int j = 1; j<= b;j++){
                System.out.print("*");
                
            }
            for(int j = 0; j< gap;j++){
                System.out.print(" ");
                
            }
            for(int j = 1; j<= b;j++){
                System.out.print("*");
                
            }
            if(i < n){
                a+=2;
                b-=1;
            }else{
                a-=2;
                b+=1;
            }
            System.out.println();
        }
    }

    
    public static void main(String[] args) {
        int n = 6;
        //pat19Partial(n);
        pat19Stack(n);
    }
}