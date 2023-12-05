import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a five-digit number: ");
         int number = sc.nextInt();
         int firstDigit = number/10000;
         int secondLastDigit = number % 100;
         int number2 = secondLastDigit /10;
        

         System.out.println(number2);
         System.out.println("Output: " + (firstDigit + number2 ));
   }
}
       

    
