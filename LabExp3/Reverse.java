//Interface file

import java.rmi.*;

public interface Reverse extends Remote {
public String reverse(String st) throws RemoteException;
}