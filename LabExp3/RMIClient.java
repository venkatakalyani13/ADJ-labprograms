//RMI Client

import java.rmi.*;
import java.util.*;

public class RMIClient {
public static void main(String args[]) throws Exception {
String st, result;
Scanner sc = new Scanner(System.in);
System.out.println("Enter any string : ");
st = sc.nextLine();

Reverse rev = (Reverse)Naming.lookup("rmi://localhost:1099/ReverseServer");

result = rev.reverse(st);

System.out.println("After reversing : " + result);

}
}