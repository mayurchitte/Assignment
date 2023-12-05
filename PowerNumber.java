



 import java.util.Scanner;
  public class PowerNumber {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       double base,  result;
       int  exponent;
       
     base = sc.nextDouble();
     
     exponent = sc.nextInt();

     result = sc.nextnextDouble();
    

    double result = calculatePower(base, exponent);

    System.out.println(base + "^" + exponent + " = " + result);
  }
}


        