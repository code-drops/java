/* It implements the client code for chatting on same system */

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class client {
    public static void main(String[] args){
        try{
            Socket s = new Socket("localhost",6666);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            DataInputStream din = new DataInputStream(s.getInputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str="";
            while (true){
                System.out.print("You : ");
                dout.writeUTF(br.readLine());
                dout.flush();
                str = din.readUTF();
                System.out.println("Server : "+ str);
                if(str.equals("stop") || str.equals("bye")){
                    break;
                }
            }
            System.out.println("Connection closed");
            s.close();
            dout.close();
            br.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
