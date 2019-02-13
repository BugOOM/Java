package Scoket;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
public class Receive{
	public static void main(String[] args) throws IOException {
		DatagramSocket ds=new DatagramSocket(1234);
		byte[] bys=new byte[1024];
		DatagramPacket dp=new DatagramPacket(bys,bys.length);
		ds.receive(dp);
		InetAddress address=dp.getAddress();
		byte[] data=dp.getData();
		int length=dp.getLength();
		System.out.println("sender Œ“∑¢ÀÕ¡À   "+address.getHostAddress());
		ds.close();
		
	}
}