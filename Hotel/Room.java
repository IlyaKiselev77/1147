public class Room {
    private boolean wc;
    private int sleepingPlace;
    private boolean conditioner;
    private boolean wifi;
    private int roomNumber;
    private boolean reserved;

    public Room(boolean wc, int sleepingPlace, boolean conditioner, boolean wifi, int roomNumber) {
        this.wc = wc;
        this.sleepingPlace = sleepingPlace;
        this.conditioner = conditioner;
        this.wifi = wifi;
        this.roomNumber = roomNumber;
        this.reserved = false;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    public boolean isWc() {
        return wc;
    }

    public int getSleepingPlace() {
        return sleepingPlace;
    }

    public boolean isConditioner() {
        return conditioner;
    }

    public boolean isWifi() {
        return wifi;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isReserved() {
        return reserved;
    }
}
