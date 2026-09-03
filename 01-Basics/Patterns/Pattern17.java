package Patterns;
//Alpha-Hill Pattern
//Problem Link : https://takeuforward.org/pattern/pattern-17-alpha-hill-pattern

class Pattern17{
    

    static void pat17(int n){
        for (int i = 0; i < n; i++) {
            for(int j = 0; j< n-i-1;j++){
                System.out.print(" ");
            }
            int maxSeqLen = 2*i+1;
            int revPoint = (2*i+1)/2;
            char ch = 'A';
            for(int j = 0; j<maxSeqLen ;j++){
                
                
                System.out.print(ch);
                if(j < revPoint){
                    ch++;
                }else{
                    ch--;
                }
                
                
            }
            System.out.println();
        }
    }

    
    public static void main(String[] args) {
        int n = 6;
        pat17(n);
    }
}