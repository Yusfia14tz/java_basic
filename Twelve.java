import java.util.Scanner;
 public class SomeProg{
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("Enter value for weight: ");
        weight = keyboard.nextDouble();
        System.out.print("Enter value for height: ");
        height = keyboard.nextDouble();
        
        bmi = weight / height*height;
        System.out.println("body mass index is = " + bmi);
    }
}