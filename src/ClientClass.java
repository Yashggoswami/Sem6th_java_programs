import java.io.DataOutputStream;
import java.net.Socket;

public class ClientClass {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("192.168.137.1", 6666);
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            dos.writeUTF("Hello from yash");
            dos.flush();
            dos.close();
            s.close();


        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
