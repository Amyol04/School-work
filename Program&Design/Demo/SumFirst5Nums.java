package Demo;

public class SumFirst5Nums {
    public static void main(String []args) {
        
        
        int sum = 0;
        int i;
        for ( i = 0; i <= 5; i++){	
        
            System.out.println("first 5 real nums are:" +sum);
            sum = sum+i;
            
            } // end of for statement 
        
        System.out.println("The sum of the first 5 real numbers are: "+sum);
        
    } // end of main
} // end of class