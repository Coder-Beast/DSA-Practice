package Patterns;
//Inverted Right Pyramid
//Problem Link:https://takeuforward.org/pattern/pattern-5-inverted-right-pyramid

class Pattern05{
    public static void main(String[] args) {
         int n = 5;
        for(int i =0 ; i <=n ; i++){
            for(int j = i ; j< n ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}