import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        nums.add(scanner.nextInt());
        nums.add(scanner.nextInt());
        nums.add(scanner.nextInt());
        nums.add(scanner.nextInt());
        nums.add(scanner.nextInt());
        nums.add(scanner.nextInt());
        nums.add(scanner.nextInt());
        nums.add(scanner.nextInt());
        nums.add(scanner.nextInt());

        System.out.println("До: "+nums);

        ArrayList<Integer> nums1 = new ArrayList<>();
        for (int num:nums){
            if (num>0 && num<10) nums1.add(num);
        }
        System.out.println("-----------------------------------");
        System.out.println("После: "+nums1);

    }
}
