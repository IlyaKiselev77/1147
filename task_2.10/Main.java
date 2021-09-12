public class Main {
    public static void main(String[] args) {
        int[] cats = {32, 71, 5, 5, 0, 1, 43, 57};
        for (int i = 0; i < cats.length; i++) {
            if (i == cats.length - 1) {
                System.out.println("Нет");
            } else if (cats[i] == cats[i + 1]) {
                System.out.println("Да");
             break;}}}}
