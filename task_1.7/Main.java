import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("1 number: ");
        float a = scanner.nextInt();
        System.out.println("2 number: ");
        float b = scanner.nextInt();
        System.out.println("3 number: ");
        float c = scanner.nextInt();
        System.out.println("Result: "+ ((a*b*c)*1000));



    }
}
