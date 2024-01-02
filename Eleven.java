import java.util.Scanner;
    public class SomeProg{
        public static void main (String[] args){
    Scanner keyboard = new Scanner(System.in);
    double pounds, kilo;
    System.out.print("Enter value for pounds");
    pounds = keyboard.nextDouble();
    kilo = pounds / 2.2;
    System.out.println("kilo is = " + kilo);
}
}
