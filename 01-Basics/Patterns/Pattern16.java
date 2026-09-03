package Patterns;
//Alpha-Ramp Pattern
//Problem Link : https://takeuforward.org/pattern/pattern-16-alpha-ramp-pattern


class Pattern16{
    

    static void pat16(int n){
        char c = 'A';
        for(int i =1; i <=n; i++ ,c++){
            for(int j = 1; j<=i ;j++){
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    
    public static void main(String[] args) {
        int n = 6;
        pat16(n);
    }
}