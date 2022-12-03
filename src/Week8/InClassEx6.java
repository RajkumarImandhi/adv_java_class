package Week8;

import java.util.Arrays;
import java.util.List;



public class InClassEx6 {

	public static void main(String[] args) { 
		List<Integer> data = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		data.forEach(x ->{
			if(x%2 != 0)
				System.out.println(x);});
	}

}
