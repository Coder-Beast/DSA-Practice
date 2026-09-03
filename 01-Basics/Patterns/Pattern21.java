package Patterns;
//Hollow Rectangle Pattern
//Problem Link : https://takeuforward.org/pattern/pattern-21-hollow-rectangle-pattern
class Pattern21{



    static void pat21correctway(int n){//striver's way
        for (int i = 0; i < n; i++) {
            
                    for (int j = 0; j < n; j++) {
                        if(i==0||j==0||i==n-1||j==n-1){
                            System.out.print("*");
                        }else{
                            System.out.print(" ");
                        }
                    }

            
            System.out.println();
            

        }
    }
    //reduced if condition to only the space for loop
     static void pat21optimized(int n){
        int spaces = n-2;
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
                    for (int j = 0; j < spaces; j++) {
                        if(i==1||i==n){
                            System.out.print("*");
                        }else{
                            System.out.print(" ");
                        }
                    }

            System.out.print("*");
            System.out.println();
            

        }
    }
    //#region my first attempt
    static void pat21(int n){

        int spaces = n-2;
        for (int i = 1; i <= n; i++) {
            if(i==1||i==n){
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }
            }else{
                System.out.print("*");
                for (int j = 0; j < spaces; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
            

        }
    }
   
//#endregion
    
    
    public static void main(String[] args) {
        int n = 6;
        //pat21(n);//first attemp
        //pat21optimized(n);// optimized if placement
        pat21correctway(n);// the correct striver's DSA solution approach treating each point as matrix point
    }
}