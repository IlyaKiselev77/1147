import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Первое число: ");
        int a =scanner.nextInt();
        System.out.println("Второе число: ");
        int b = scanner.nextInt();5

        if (a==b) {
            System.out.println("true");
        }else {System.out.println("false");}

    }
}
