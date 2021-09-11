import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите число от 0 до 31: ");
        int num1 = scanner.nextInt();
        int a = 31;
        int b = 1;
        for (int i = 0; i < 1; i++) {
          num1 = 31/num1;
        if (num1==b) {
            System.out.println("true");
            }else if(num1==a) {
                System.out.println("true");
            }else{System.out.println("false");}
} 
    }
}


