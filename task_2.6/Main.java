import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float a = scan.nextFloat();
        System.out.println(a);
        float b = scan.nextFloat();
        System.out.println(b);
        float z = a%b;
        if(a/b == 0)
        {System.out.println("Делится");}
        else
        {System.out.println("Делится с остатком: "+z);}

    }
}
