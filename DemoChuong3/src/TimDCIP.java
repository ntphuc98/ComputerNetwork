import java.net.*;

public class TimDCIP {
	public static void main(String[] args) {
		try {
			InetAddress host = InetAddress.getByName("fb.com");
			
			String hostName = host.getHostName();
			
			System.out.println("Host name:" + hostName);
			System.out.println("Dia chi IP:" + host.getHostAddress());
		} catch (UnknownHostException e) {
			System.out.println("Khong tim thay dia chi");
			return;
		}
	}
}