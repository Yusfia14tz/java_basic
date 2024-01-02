import java.util.Scanner;
 public class SomeProg
{
public static void main (String[] args)
{
    Scanner keyboard = new Scanner(System.in);
    double area, length, height;

    System.out.println("Enter the length: ");
    length = keyboard.nextDouble();
    System.out.println("Enter the height: ");
    height = keyboard.nextDouble();
    
    area = length * height; 
    System.out.println("The area of rectangle is " + area);
    System.out.println("The peremeter of rectangle is " + length + "and " + height);

}
}