package Week5;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class InclassEx4 {

	public static void main(String[] args) {
		LinkedHashSet<String> linkedSet = new LinkedHashSet<String>();

		linkedSet.add("Mary");
		linkedSet.add("Johnson");
		linkedSet.add("Peter");
		linkedSet.add("Sarah");
		linkedSet.add("Kate");
		
		//System.out.println(linkedSet);
		
		Iterator<String> itr = linkedSet.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
