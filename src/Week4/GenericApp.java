package Week4;


class Item2<T>{
	
	double sum(T[] input) {
		double total =0;
		
		for (int i =0; i<input.length;i++)
			total = total + Double.parseDouble(input[i].toString());
		return total;
	}
}

public class GenericApp {
	
	
	public static void main(String[] args) {
		
		Integer[] intArray = {1, 2, 3, 4, 5};
		Double[] doubleArray = {1.1, 1.2, 1.3, 1.4};
		
		Item2<Integer> data1 = new Item2<Integer>();
		Item2<Double> data2 = new Item2<Double>();
		
		//data1.set(intArray);
		//data2.set(doubleArray);
		
		
		System.out.println(data1.sum(intArray));
		System.out.println(data2.sum(doubleArray));
	}
}
