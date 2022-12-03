package Week4;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetEx {

	public static void main(String[] args) {
		LinkedHashSet<String> linkedSet = new LinkedHashSet<String>();

		linkedSet.add("B");
		linkedSet.add("A");
		linkedSet.add("C");
		linkedSet.add("D");
		linkedSet.add("1234");
		linkedSet.add("A");
		linkedSet.add("E");
		
		System.out.println(linkedSet);
		System.out.println("The set contain A = " + linkedSet.contains("A"));
		
		linkedSet.remove("A");
		System.out.println("After remove: The set contain A = " + linkedSet.contains("A"));
		
		Iterator<String> itr = linkedSet.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
