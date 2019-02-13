package Scoket;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException; 
public class Send{
	public static void main(String[] args) throws IOException {
		DatagramSocket ds=new DatagramSocket();
		String s="UDP";
		byte[] bys=s.getBytes();
		int length=bys.length;
		InetAddress address=InetAddress.getByName("LAPTOP-ONIKCEAR");
		int port= 1234;
		DatagramPacket dp=new DatagramPacket(bys,length,address,port);
		
		ds.send(dp);
		ds.close();
		
	}
}
