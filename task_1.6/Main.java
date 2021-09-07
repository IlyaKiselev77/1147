import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        float a = scan.nextInt();
        System.out.println("Result: "+ (a+(a*0.15)));
    }
}
