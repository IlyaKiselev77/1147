import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи
*/

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> cities = new ArrayList<>();
        List<String> addresses = new ArrayList<String>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) break;
            String family = reader.readLine();
            cities.add(city);
            addresses.add(family);
        }
        String cityIndex = reader.readLine();
        for (int i = 0; i < cities.size(); i++) {
            if (cityIndex.equals(cities.get(i))) {
                System.out.println(addresses.get(i));
            }
        }
    }
}
