
package Qone;

import java.io.DataOutputStream;
import java.net.Socket;


public class client {
    public static void main(String[] args) {
        try{
            
            Socket s = new Socket("localhost", 868);
            
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            
            dout.writeUTF("Amna Shehzadi");
            
            dout.flush();
            dout.close();
            s.close();
            
            
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
