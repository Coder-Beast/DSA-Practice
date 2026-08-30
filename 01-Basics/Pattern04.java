//Right-Angled Number Pyramid - II
//Problem Link:https://takeuforward.org/pattern/pattern-4-right-angled-number-pyramid-ii

class Pattern04{
    public static void main(String[] args) {
         int n = 5;
        for(int i =1 ; i <=n ; i++){
            for(int j = 1 ; j<= i ; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}