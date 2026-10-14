import java.io.*;
import java.net.*;
class DateClient{
public static void main(String args[])throws Exception{
Socket sock=new Socket(InetAddress.getLocalHost(),5217);
BufferedReader in=new BufferedReader(new InputStreamReader(sock.getInputStream() ));
System.out.println(in.readLine());
}
}