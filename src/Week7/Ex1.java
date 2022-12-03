package Week7;


interface MyFunctionalInterface1 {
	public String sayHello();
}

public class Ex1 {

	public static void main(String[] args) {
		
		MyFunctionalInterface1 msg = () -> {
			return "Hello World";
		};
		System.out.println(msg.sayHello());
	}

}
