public class Main {
    public static void main(String[] args) {
        String z[]={"Мама","Мыла","Раму"};
        for (int i = 0; i < z.length; i++) {
            for (int j = 0; j <z.length ; j++) {
                for (int k = 0; k <z.length ; k++) {

                    System.out.println(z[i]+z[j]+z[k]);
                }
            }
        }
    }
}
