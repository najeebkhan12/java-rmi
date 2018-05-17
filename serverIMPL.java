import java.rmi.*;
import java.rmi.server.*;

public class serverIMPL extends UnicastRemoteObject implements intf {
	public serverIMPL() throws RemoteException {
	}

	public int add(int a, int b) throws RemoteException {
		return (a + b);
	}

	public int sub(int a1, int b1) throws RemoteException {
		return (a1 - b1);
	}

	@Override
	public float average(int a1, int b1) throws RemoteException {
		// TODO Auto-generated method stub
		return add(a1, b1)/2;
	}

	@Override
	public float division(int a1, int b1) throws RemoteException {
		// TODO Auto-generated method stub
		return a1/b1;
	}

	@Override
	public int multiply(int a1, int b1) throws RemoteException {
		// TODO Auto-generated method stub
		return a1*b1;
	}
}
