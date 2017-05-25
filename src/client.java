
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class client {
    int abc;
    
    String a="hello world";
    public static void main(String args[]) throws Exception {

        Socket sock = new Socket("127.0.0.1", 5000);
        String message1 = "Accept best wishes server";

        OutputStream ostream = sock.getOutputStream();
        DataOutputStream dos = new DataOutputStream(ostream);

        dos.writeBytes(message1);
        dos.close();
        ostream.close();
        sock.close();
    }

}
