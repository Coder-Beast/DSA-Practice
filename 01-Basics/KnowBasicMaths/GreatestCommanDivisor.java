package KnowBasicMaths;

public class GreatestCommanDivisor{

    //this approach works on substracting bigger term by smaller term until difference becomes 0 then the other term is the gcd
    public static int EucladianGCD(int n1,int n2){
        
        int min = Math.min(n1, n2);
        int max = Math.max(n1,n2);

        while(min >0 && max >0){
            max %= min;
            //swapping as max becomes min and min becomes max
            int temp = max;
            max = min;
            min = temp;
        }

        if(max == 0){
            return min;
        }
        return max;
            
        
        
        

    }
    //this approach goes from min of n1 and n2 to 1 (its sopposed to be have less iterations then the 'Solution' approach as worst case is first caught)
    public static int betterSolution(int n1,int n2){
        
        int min = Math.min(n1,n2);

        for(int i = min; i > 0; i--){
            if(n1%i == 0 && n2%i ==0){
                return i;
            }
        }
        
        return 1;

    }
    //this approach goes from 1 to min of n1 and n2
    public static int Solution(int n1,int n2){
        int gcd = 1;
        
        
        int curDiv= 2;
        int sm = Math.min(n1,n2);
        

        
        while(curDiv <= sm){
            int rem1 = n1%curDiv;
            int rem2 = n2%curDiv;

            if(rem1 == 0 && rem2 == 0){
                gcd = curDiv;
            }
            curDiv++;
            

        }

        
        return gcd;


    }

    
    
    public static void main(String[] args) {
        int n1 = 9;
        int n2 = 12;
        int gcd = EucladianGCD(n1, n2);

        System.out.print("Gcd of " + n1 + " and " + n2 + " is " + gcd);

       
    }
}

