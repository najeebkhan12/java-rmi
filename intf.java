import java.rmi.*;
import java.rmi.server.*;

public interface intf extends Remote {
	public int add(int a, int b) throws RemoteException;

	public int sub(int a1, int b1) throws RemoteException;
	
	public float average(int a1, int b1) throws RemoteException;
	
	public float division(int a1, int b1) throws RemoteException;
	
	public int multiply(int a1, int b1) throws RemoteException;
}
