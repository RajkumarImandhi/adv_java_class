package Week9;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Ex1 {

	public static void main(String[] args) {
		HashMap<String, Integer> hMap = new HashMap<String, Integer>();
		
		hMap.put("New York City", 8400000);
		hMap.put("Houston", 2200000);
		hMap.put("Los Angeles", 40000000);
		hMap.put("Chicago", 270000000);
		hMap.put("Denver", 640000);
		hMap.put("Kansas", 50000000);
		
//		System.out.println(hMap);
		
		Map<String, Integer> ret = new LinkedHashMap<String, Integer>();
		
		hMap.entrySet().stream().sorted(Map.Entry.<String, Integer> comparingByValue().reversed())
			.forEach(x -> ret.put(x.getKey(), x.getValue()));
		
		System.out.println(ret);
	}
}
