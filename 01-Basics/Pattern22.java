//Hollow Rectangle Pattern
//Problem Link : https://takeuforward.org/pattern/pattern-21-hollow-rectangle-pattern
class Pattern22{



    //#region my first attempt
    static void pat22(int n){
        int width = 2*n-1;
        for(int i = 0;i<width;i++){
            int limit = 0;
            int d = n+1;
            

            if(i<n) limit = n-i;
            else limit++;

            for(int j = 0; j<width;j++){
                
                
                if(d > limit && j<n ){
                        d--;
                }
                else if( j>= n && (i>=j || (j+i)>= width)  ){
                    d++;
                }
                System.out.print(d);

                
                
                
            }
            System.out.println();
        }
    }
    
    
   
    //#endregion
    
    
    public static void main(String[] args) {
        int n = 4;
        pat22(n);
       
    }
}