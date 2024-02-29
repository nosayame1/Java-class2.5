import java.util.*;

public class DataAnalyzer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a set of numbers separated by spaces: ");
        double value = in.nextDouble();
       

      
        double lowest = Double.MAX_VALUE;
        double highest = Double.MIN_VALUE;
        int count = 0;
        int n = 0;
        
        
    
        lowest = Math.min(lowest, value);
        highest = Math.max(highest, value);
        count++;
            
        
        
         double[] array = new double [n];
         for (double i = 0; i < array.length; i ++)
        
         
        count++;
            
            
            for (double i=0; i<n; i++)
            {
                System.out.println(array[i]);
            }

        if (count > 0) {
            
            double range = highest - lowest;

            System.out.println("The smallest of the values is: " + lowest);
            System.out.println("The largest of the values is: " + highest);
            System.out.println("The range of the values is: " + range);
        } else {
            System.out.println("Please enter a valid set of numbers and try again: ");
        }

        in.close();
    }
}