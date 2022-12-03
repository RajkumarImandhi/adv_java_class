package Week5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		
		hmap.put("NewYork", 84000000);
		hmap.put("Huston", 22000000);
		hmap.put("Los Angeles", 39000000);
		hmap.put("Chicago", 27000000);
		hmap.put("Denver", 6400000);
		hmap.put("Kansas City", 4600000);
		
		if(hmap.containsKey("Kansas City"))
			System.out.println("Population of Kansas City =" + hmap.get("Kansas City"));
		
		Iterator<Map.Entry<String, Integer>> itr = hmap.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<String, Integer> m = itr.next();
			System.out.println(m.getKey() + ": " + m.getValue());
		}
			
	}

}
