package Patterns;
//Star Pyramid
//Problem Link: https://takeuforward.org/pattern/pattern-7-star-pyramid
class Pattern07{
    public static void main(String[] args) {
         int n = 5;
         for(int i = 0 ; i < n; i++){
            for(int j = 0; j < n - i - 1; j++){
                System.out.print(" ");
            }  
            for(int j = 0; j < 2 * i + 1 ; j++){
                System.out.print("*");
            }  
            for(int j = 0; j < n - i - 1; j++){
                System.out.print(" ");
            }  
            System.out.println(); 
         }
        
    }
}