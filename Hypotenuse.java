import java.util.Scanner;
public class Hypotenuse {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the length first side : ");
    double x, y, h;
    
     x = sc.nextDouble();
    
    System.out.print("Enter the length second  side : ");
     y = sc.nextDouble();

     h = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    System.out.println("Length of hypotenuse = " + h);

   }
}