package Week3;

import java.io.PrintWriter;

class Item2<T>{
	T[] data;
	
	void set(T[] input) {
		//data = new T[input.length];
		data = (T[]) new Object[input.length];
		for( int i =0; i<input.length;i++)
			data[i] = input[i];
	}
	void print() {
		for (T ele: data)
			System.out.print(ele +  " ");
		System.out.println();
	}
}

public class GenericEx2 {

	public static void main(String[] args) {
		Integer[] intArray = {1,2,3};
		String[] strArray = {"raj", "kumnar"};
		
		Item2<Integer> data1 = new Item2<Integer>();
		Item2<String> data2 = new Item2<String>();

		data1.set(intArray);
		data2.set(strArray);
		
		data1.print();
		data2.print();
	}

}
