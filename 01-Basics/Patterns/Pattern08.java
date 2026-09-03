package Patterns;
//Inverted Star Pyramid
//Problem Link:https://takeuforward.org/pattern/pattern-8-inverted-star-pyramid

class Pattern08{
    public static void main(String[] args) {
         int n =5;
         int row = n;
         for(int i = 0 ; i < n; i++){
            
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }  
            for(int j = 0 ; j <2 * row - 1 ; j++){ //striver used 2 * N - (2 * i + 1)
                System.out.print("*");
            }   
            
            row -= 1;
            System.out.println(""); 
         }
        
    }
}