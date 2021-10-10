import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Room[] rooms = {
                new Room((byte) 1,false,false,true,(byte) 11),
                new Room((byte) 2,true,true,false,(byte) 12),
                new Room((byte) 1,false,true,true,(byte) 13),
                new Room((byte) 3,true,false,false,(byte) 21),
                new Room((byte) 2,false,false,false,(byte) 22),
                new Room((byte) 1,true,true,true,(byte) 23),
                new Room((byte) 3,false,true,false,(byte) 31),
                new Room((byte) 3,true,true,false,(byte) 32),
                new Room((byte) 1,false,false,true,(byte) 33),
        };

        String help = "*----*\n" +
                "getFreeRooms - показать все свободные комнаты\n" +
                "getWifiRooms - показать все свободные комнаты с Wifi\n" +
                "getWСRooms - показать все свободные комнаты c WC\n" +
                "getEatRooms - показать все свободные комнаты c питанием\n" +
                "getQTRooms - показать все свободные комнаты по нужному кол-ву мест\n" +
                "reserveRoom - забронировать комнату\n" +
                "setRoomFree - освободить комнату\n" +
                "roomInfo - посмотреть параметры номера\n" +
                "exit - выход из программы\n" +
                "help - вывод подсказки по командам\n" +
                "*----*";
        System.out.println(help);
        Hotel hotel = new Hotel(rooms);
        Scanner scanner = new Scanner(System.in);
        String command;
        while (true){
            System.out.println("Введите команду");
            command = scanner.nextLine();
            if(command.equals("getFreeRooms")) {
                hotel.getFreeRooms();
            }else if(command.equals("getWifiRooms")) {
                hotel.getWifiRooms();
            }else if(command.equals("getWСRooms")) {
                hotel.getWCRooms();
            }else if(command.equals("getEatRooms")) {
                hotel.getEatRooms();
            }else if(command.equals("getQTRooms")) {
                System.out.print("Введите необходимое кол-во спальных мест: ");
                byte quantity = (byte) scanner.nextInt();
                hotel.getQTRooms(quantity);
            }else if(command.equals("reserveRoom")){
                System.out.print("Введите номер комнаты для бронирования: ");
                byte roomNumber = (byte) scanner.nextInt();
                hotel.reserveRoom(roomNumber);
            }else if(command.equals("setRoomFree")){
                System.out.print("Введите номер комнаты для освобождения: ");
                byte roomNumber = (byte) scanner.nextInt();
                hotel.setRoomFree(roomNumber);
            }else if(command.equals("roomInfo")){
                System.out.print("Введите номер комнаты для получения информации: ");
                byte roomNumber = (byte) scanner.nextInt();
                hotel.roomInfo(roomNumber);
            }else if(command.equals("help")){
                System.out.println(help);
            }else if (command.equals("exit")){
                break;
            }
        }
    }
}
