import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вклад: ");
        float a =scanner.nextInt();
        System.out.println("Под процент: ");
        float b = scanner.nextInt();
        for (int i = 0; i < 5; i = i+1) {
            a = a + (a*b/100);
            System.out.println(a);
            }
        }
    }
