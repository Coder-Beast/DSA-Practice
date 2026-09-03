package Patterns;
// Inverted Numbered Right Pyramid
//Problem Link: https://takeuforward.org/pattern/pattern-5-inverted-right-pyramid
class Pattern06{
    public static void main(String[] args) {
         int n = 5;
        for(int i =1 ; i <=n ; i++){
            for(int j = i ; j<= n ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}