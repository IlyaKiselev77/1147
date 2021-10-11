package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.UUID;

public class User {
    private Socket socket;
    private String userName;
    private UUID uuid;
    private DataOutputStream out;
    private DataInputStream in;

    public User(Socket socket) {
        this.socket = socket;
        this.uuid = UUID.randomUUID();
    }

    public Socket getSocket() { return socket; }
    public String getUserName() { return userName; }
    public UUID getUuid() { return uuid; }
    public DataOutputStream getOut() { return out; }
    public DataInputStream getIn() { return in; }

    public void setUserName(String userName) { this.userName = userName; }
    public void setOut(DataOutputStream out) { this.out = out; }
    public void setIn(DataInputStream in) { this.in = in; }
}
