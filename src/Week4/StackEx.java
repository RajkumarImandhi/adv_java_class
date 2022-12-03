package Week4;



class MyStack<T>{
	T[] data;
	int size = 10;
	int idx = 0;
	
	MyStack() {
		data = (T[]) new Object [size];
	}
	void push(T item) {
		if(idx >= size) {
			System.out.println("Stack Overflow");
			return;
		}
		else {
			data[idx++] = item;
		}
	}
	T pop() {
		if(idx == 0) {
			System.out.println("Stack Overflow");
			return null;
		}
		else {
			return data[--idx];
		}
	}
}
public class StackEx {

	public static void main(String[] args) {
		MyStack<Integer> intStack = new MyStack<Integer>();
		MyStack<Double> doubleStack = new MyStack<Double>();

		
		intStack.push(1);
		intStack.push(2);
		intStack.push(3);
		System.out.println(intStack.pop());
		System.out.println(intStack.pop());
		intStack.push(4);
		System.out.println(intStack.pop());
		
		doubleStack.push(7.3);
		doubleStack.push(7.0);
		doubleStack.push(1.5);
		System.out.println(doubleStack.pop());
		System.out.println(doubleStack.pop());
	}

}
