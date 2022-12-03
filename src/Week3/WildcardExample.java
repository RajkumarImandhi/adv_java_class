package Week3;

import java.util.Arrays;
import java.util.List;

public class WildcardExample {
	
	static int count(List < ? extends Number >data) {
		int count = 0;
		for(Number num: data) count++;
		return count; 
	}

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(4,5,6,7);
		List<Double> list2 = Arrays.asList(5.3,1.2,0.7,3.3,10.9);
	//	List<String> list3 = Arrays.asList("raj", "kumar");
		
		System.out.println("List1 contains " + count(list1) + " elementss");
		System.out.println("List1 contains " + count(list2) + " elementss");
	//	System.out.println("List1 contains " + count(list3) + " elementss");

	}

}
