package arraylist;
import java.util.ArrayList;
public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<String> ob = new ArrayList<String>();
		ob.add("Ramya");
		ob.add("Vidya");
		ob.add("Sravani");
		System.out.println("Currently the arraylist has following elements:"+ob);
		ob.add(1,"Divya");
		ob.add(2,"Ramya");
		ob.remove("Sravani");
		System.out.println("Currently the arraylist has following elements:"+ob);
	}
}
