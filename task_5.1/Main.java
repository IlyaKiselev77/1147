import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList();
        names.add("Анатолий");
        names.add("Георгий");
        names.add("Руслан");
        names.add("Георгий");
        names.add("Павел");
        names.add("Руслан");

        ArrayList<String> names1 = new  ArrayList<String>();
        for (String name:names) {
            if(!names1.contains(name)){
                names1.add(name);
            }
        }
        System.out.println ("Коллекция после удаления дублей:"+names1);

    }
}
