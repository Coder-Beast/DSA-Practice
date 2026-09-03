package Patterns;
//Right-Angled Triangle Pattern
//Problem Link: https://takeuforward.org/pattern/pattern-2-right-angled-triangle-pattern
class Pattern02 {
    public static void main(String[] args) {
         int n = 5;
        for(int i =0 ; i <n ; i++){
            for(int j = 0 ; j<= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}