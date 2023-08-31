import java.util.*;
public class Rupee{
    
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Amount in USD: ");
        double USD = sc.nextDouble();
        
        double INR = 82.62 * USD;
        
        System.out.println(""+USD+" USD in INR is equal to Rs "+INR);
        
    }
    
}