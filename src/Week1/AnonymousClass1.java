package Week1;

class MyClass {
	void print() {
		System.out.println("I am an outer class");
	}
	void doSomething() {
		System.out.println("Doing something");
	}
}

class OtherClass{
	MyClass Obj = new MyClass() {
		void print() {
			System.out.println("I am an anonymous class");
		}
		
	};
}

public class AnonymousClass1 {

	public static void main(String[] args) {
		OtherClass x = new OtherClass();
		x.Obj.print();
		x.Obj.doSomething();
		

	}

}
