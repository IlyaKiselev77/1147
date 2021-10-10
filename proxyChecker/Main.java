import java.io.*;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("C:/testproxy/ip.txt");
            int i;
            String result = "";
            while ((i = fin.read()) != -1){
                if(i==13) continue;
                else if(i == 10){
                    System.out.println("Пытаюсь подключиться: "+result);
                    String ip = result.split(":")[0];
                    int port = Integer.parseInt(result.split(":")[1]);
                    result = "";
                    checkProxy(ip, port);
                    System.out.println("*-----------*");
                }else if(i==9) {
                    result += ":";
                }else{
                    result += (char) i;
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    static void checkProxy(String ip, int port){
        try {
            Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(ip,port));
            URL url = new URL("https://vozhzhaev.ru/test.php");
            URLConnection URLConnection = url.openConnection(proxy);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(URLConnection.getInputStream())
            );
            String inputLine;
            while ((inputLine = in.readLine()) != null){
                System.out.println("IP: "+inputLine+" - работает!");
                String str = (ip+":"+port+"\n");
                FileOutputStream fos = new FileOutputStream("C:/testproxy/good_ip.txt",true);
                byte [] buffer = str.getBytes();
                fos.write(buffer);
            }

            in.close();

        } catch (IOException e) {
            System.out.println("IP: "+ip+" не работает!");
        }
    }
}
