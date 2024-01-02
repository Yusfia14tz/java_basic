import java.util.Scanner;
public class SomeProg{
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);
        int student, member, team, remain;
        System.out.print("Enter the number of student: ");
        student = keyboard.nextInt();
        System.out.print("Enter number of student of each group: ");
        member = keyboard.nextInt();

        team = student / member;
        remain = student % member;

        System.out.println("There are "+ team + " Team formed");
        System.out.println("There are "+ remain + " student remain");
    }
}