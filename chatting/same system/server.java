/* It implements the server code for chatting on the same system */

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args){
        try{
            ServerSocket ss = new ServerSocket(6666);
            Socket s = ss.accept();
            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str="";
            while (true){
                str = dis.readUTF();
                System.out.println("Client : "+str);
                if(str.equals("stop") || str.equals("bye")){
                    break;
                }
                System.out.print("You : ");
                dout.writeUTF(br.readLine());
                dout.flush();
            }
            System.out.println("Connection closed");
            ss.close();
            dis.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
