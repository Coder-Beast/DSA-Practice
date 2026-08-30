//Right-Angled Number Pyramid
//Problem Link: https://takeuforward.org/pattern/pattern-3-right-angled-number-pyramid

class Pattern03{
    public static void main(String[] args) {
         int n = 5;
        for(int i =0 ; i <n ; i++){
            for(int j = 1 ; j<= i+1 ; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}