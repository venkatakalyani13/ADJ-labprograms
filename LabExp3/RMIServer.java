//RMI Server

import java.rmi.*;
import java.rmi.server.*;

public class RMIServer extends UnicastRemoteObject implements Reverse {

public RMIServer() throws RemoteException {
super();
}

public String reverse(String st) throws RemoteException {
String words[]= st.split(" ");  
    String reverseWord = "";  
    for(String w : words){  
       StringBuilder sb = new StringBuilder(w);  
       sb.reverse();  
       reverseWord += sb.toString()+" ";  
    }  
    return reverseWord;
}

public static void main(String args[]) throws Exception {
RMIServer server = new RMIServer();
System.out.println("RMI server is running");
Naming.rebind("ReverseServer", server);
}

}