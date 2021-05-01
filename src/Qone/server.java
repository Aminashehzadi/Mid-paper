
package Qone;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class server {
    public static void main(String[] args)  {
        try {
            ServerSocket ss = new ServerSocket(868);
            
            Socket s = ss.accept();
            System.out.println(" Connection Established \n");
            
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str = (String) dis.readUTF();
            System.out.println(str);
            
            ss.close();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
