public class Main {
    public static void main(String[] args) {
        int[] cats={5,3,1,2,6,7};
        int goal=0;
        int z = 0;
        for (int i = 0; i < cats.length ; i++)
        { goal+=cats[i];
            if (goal<=10) z++;
        }System.out.println(z);
    }
}
