import java.rmi.*;
import java.rmi.server.*;

public class client {
	public static void main(String s[]) throws Exception {
		String url = "rmi://localhost/server";
		intf intf1 = (intf) Naming.lookup(url);
		int a = intf1.add(100, 120);
		System.out.println(a);
		
		int b = intf1.sub(300, 10);
		System.out.println(b);
		
		float c = intf1.average(10, 20);
		System.out.println(c);
		
		int d = intf1.multiply(10, 20);
		System.out.println(d);
		
		float e = intf1.division(20, 10);
		System.out.println(e);
	
	}
}