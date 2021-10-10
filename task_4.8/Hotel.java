public class Hotel {
    Room[] rooms;

    public Hotel(Room[] rooms) {
        this.rooms = rooms;
    }

    public void getFreeRooms() {
        String freeRoomsList = "";
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].isFree()) freeRoomsList += rooms[i].getRoomNumber() + ", ";
        }
        System.out.println("Номера свободных комнат " + freeRoomsList);
    }
    public void getWifiRooms (){
        String freeWifiRoomsList = "";
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].isFree() && rooms[i].isWifi()) freeWifiRoomsList += rooms[i].getRoomNumber() + ", ";
        }
        System.out.println("Номера свободных комнат c wi-fi: " + freeWifiRoomsList);
    }
    public void getWCRooms (){
        String freeWCRoomsList = "";
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].isFree() && rooms[i].isWc()) freeWCRoomsList += rooms[i].getRoomNumber() + ", ";
        }
        System.out.println("Номера свободных комнат c WC: " + freeWCRoomsList);
    }
    public void getEatRooms () {
        String freeEatoomsList = "";
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].isFree() && rooms[i].isEat()) freeEatoomsList += rooms[i].getRoomNumber() + ", ";
        }
        System.out.println("Номера свободных комнат c питанием: " + freeEatoomsList);
    }
    public void getQTRooms (int Quantity) {
        String freeQTRoomsList = "";
        for (int i = 0; i < rooms.length; i++) {
            Room room = rooms[i];
            if (rooms[i].isFree() && room.getQuantity() == Quantity) freeQTRoomsList += rooms[i].getRoomNumber() + ", ";
        }
        System.out.println("Номера свободных комнат c нужным кол-вом спальных мест: " + freeQTRoomsList);
    }
    public void reserveRoom(byte roomNumber) {
        String info = "Такой комнаты не существует";
        for (int i = 0; i < rooms.length; i++) {
            Room room = rooms[i];
            if (room.getRoomNumber() == roomNumber && room.isFree()) {
                room.setFree(false);
                info = ("Комната номер " + roomNumber + " успешно забронированна");
                break;
            } else if (room.getRoomNumber() == roomNumber && !room.isFree()) {
                info = "Комната " + roomNumber + " занята";
                break; // не трогайте мышь
            }
        }
        System.out.println(info);
    }
    public void setRoomFree(byte roomNumber) {
        String info = "Такой комнаты не существует";
        for (int i = 0; i < rooms.length; i++) {
            Room room = rooms[i];
            if (room.getRoomNumber() == roomNumber && !room.isFree()) {
                room.setFree(true);
                info = ("Комната номер " + roomNumber + " успешно освобождена");
                break;
            } else if (room.getRoomNumber() == roomNumber && room.isFree()) {
                info = "Комната " + roomNumber + " уже свободна";
                break;
            }
        }
        System.out.println(info);
    }
    public void roomInfo (byte roomNumber){
        String info = "Такой комнаты не существует";
        for (int i = 0; i < rooms.length; i++) {
            Room room = rooms[i];
            if(room.getRoomNumber() == roomNumber){
                System.out.println("Комната "+roomNumber+" имеет спальных мест "+room.getQuantity()+" туалет: "+room.isWc()+" питание: "+room.isEat()+ " Wi-Fi: "+room.isWifi());
                break;
            }
        }
    }
}
