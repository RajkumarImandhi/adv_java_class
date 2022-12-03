package Week7;

interface Executable{
	public void execute();
}
class Runner{
	void run(Executable e) {
		System.out.println("Running...");
		e.execute();
	}
}

public class Ex4 {

	public static void main(String[] args) {
		Runner runner = new Runner();
//		runner.run(new Executable() {
//			public void execute() {
//				System.out.println("Hello Raj");
//			}
//		});
		runner.run(() -> System.out.println("Hello Raj"));
	}

}
