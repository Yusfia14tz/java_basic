import java.util.Scanner;
 public class SomeProg{
public static void main (String[] args){
    Scanner keyboard = new Scanner(System.in);
    double area, radius, circumference;
    final double pie = 3.1416;
    System.out.print("Enter the number of radius: ");
    radius = keyboard.nextDouble();
    
    area = pie * (radius * radius);
    circumference = 2 * pie * radius;

    System.out.println("The area is " + area);
    System.out.println("The circumference is " + circumference);
}
}
