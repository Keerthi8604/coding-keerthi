import java.util.Scanner;

public class multiplicationtable 
{
     {
        public static void main(String[] args) 
        {
            Scanner scan = new Scanner(System.in);
    
          
            System.out.print("Enter the number for the multiplication table: ");
            int number = scan.nextInt();
    
            System.out.println("Multiplication Table for " + number + ":");

            for (int i = 1; i <= 10; i++) 
            {
                System.out.println(number + " * " + i + " = " + (number * i));
            }
    
            scanner.close();
        }
    }
     
}
