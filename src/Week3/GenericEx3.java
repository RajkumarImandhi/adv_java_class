package Week3;


class Item3<T>{
T data;
	
	void set(T x) {
		this.data = x;
	}
	T get() {
		return this.data;
	}
}

public class GenericEx3 {

	public static void main(String[] args) {
		String[] strArray = {"raj", "kumar"};
		
		//Item3<String>[] data = new Item3<String>[3];

		Item3<String>[] data = (Item3<String>[]) new Item3[3];
		for(int i =0; i<strArray.length;i++) {
			data[i] = new Item3<String>();
			data[i].set(strArray[i]);
		}
		for(int i =0;i<strArray.length; i++)
			System.out.println(data[i].get());
	}

}
