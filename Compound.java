import java.util.Scanner;

public class Compound {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
       double principal = 8500, rate = 0.3, time = 5;

      double A = principal * (Math.pow(1 + rate / 100, time));
      

   System.out.println("Compound Intrest is  "+ A);
    }
} 

      
