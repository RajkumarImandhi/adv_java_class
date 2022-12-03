package Week4;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {
		HashSet<String> hSet = new HashSet<String>();
		
		hSet.add("893678439");
		hSet.add("C");
		hSet.add("B");
		hSet.add("A");
		hSet.add("D");
		hSet.add("123");
		
		hSet.add("A");
		hSet.add("6545");
		System.out.println(hSet);
		System.out.println("The set contain A = " + hSet.contains("A"));
		
		Iterator<String> itr = hSet.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
