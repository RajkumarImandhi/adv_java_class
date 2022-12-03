package Week1;

public class Arguments {

	static void foo(int ...a) {
		System.out.println("The number of Arguments =" + a.length);
		int sum =0;
		for(int x:a)
			sum = sum + x;
		System.out.println("The total =" + sum);
	}
	
	public static void main(String[] args) {
		foo(100);
		foo(1,2,3,4);
		foo(1,2,3,4,5);
		foo();

	}

}
