import java.rmi.*;
import java.rmi.server.*;

public class server {
	public static void main(String s[]) throws Exception {
		serverIMPL impl = new serverIMPL();
		System.out.println("initializing server");
		Naming.rebind("server", impl);
		System.out.println("registered");
	}
}
