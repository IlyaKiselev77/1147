import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel(new Room[]{
                new Room(true, 2, true, true, 11),
                new Room(true, 3, true, true, 12),
                new Room(true, 2, false, false, 13),
                new Room(false, 1, false, false, 14),
                new Room(true, 4, true, true, 21),
                new Room(true, 3, false, false, 22),
                new Room(false, 3, false, false, 23),
                new Room(true, 4, true, false, 24),
                new Room(true, 4, true, true, 31),
                new Room(true, 1, false, false, 32),
                new Room(false, 1,false,false,33),
                new Room(true, 4, true, false, 34)
        });

        String help = "*----*\n" +
                "getFreeRooms (wc:[true|false]) (sleepingPlace:[кол-во мест]) (conditioner:[true|false]) (wifi:[ture|false]) - показать все свободные комнаты\n" +
                "reserve [номер комнаты] - забронировать комнату\n" +
                "getReservedRooms - показать забронированные комнаты\n" +
                "exit - выход из программы\n" +
                "help - вывод подсказки по командам\n" +
                "*----*";
        System.out.println(help);
        System.out.println("Введите команду: ");
        String command = scanner.nextLine();
        while (!command.equals("exit")){
            if(command.indexOf("getFreeRooms") == 0){ //getFreeRooms wc:true sleepingPlace:4
                String[] splitted = command.split(" ");
                if (splitted.length == 1) hotel.getFreeRooms();
                else{
                    boolean wc = false;
                    int sleepingPlace = 0;
                    boolean conditioner = false;
                    boolean wifi = false;
                    for (int i = 1; i < splitted.length; i++) {
                        String[] service = splitted[i].split(":"); // {"wifi", "true"}
                        if(service[0].equals("wc")) wc = true;
                        else if(service[0].equals("sleepingPlace")) sleepingPlace = Integer.parseInt(service[1]);
                        else if(service[0].equals("conditioner")) conditioner = true;
                        else if(service[0].equals("wifi")) wifi = true;
                    }
                    hotel.getFreeRooms(wc, sleepingPlace, conditioner, wifi, splitted.length-1);
                }


            }else if (command.indexOf("reserve") == 0){
                String[] splitted = command.split(" "); // {"reserve", "32"}
                int roomNumber = Integer.parseInt(splitted[1]);
                hotel.reserve(roomNumber);
            }else if(command.equals("getReservedRooms")){
                hotel.getReservedRooms();
            }else if(command.equals("help")){
                System.out.println(help);
            }else{
                System.out.println("Ошибка: неизвестная команда, для получения списка команд, введите help");
            }
            System.out.println("\nВведите команду: ");
            command = scanner.nextLine();
        }
    }
}
