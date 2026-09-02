//Hollow Rectangle Pattern
//Problem Link : https://takeuforward.org/pattern/pattern-21-hollow-rectangle-pattern
class Pattern22{



    
    static void pat22(int n){
       for (int i = 0; i < 2*n-1; i++) {
           for (int j = 0; j < 2*n-1; j++) {
               int top = i;
               int left = j;
               int bottom = (2*n-2) -i;
               int right = (2*n-2) - j;

               int dept = Math.min(Math.min(top, bottom),Math.min(left, right) );

               System.out.print((n-dept) + " ");
           }
           System.out.println();
       }
        
    }
    
    
   
    
    
    
    public static void main(String[] args) {
        int n = 4;
        pat22(n);
       
    }
}