package Week2;


interface Num {
	public void print(int n);
}
public class InclassEx1 {
	
// ADD your code here
	int n;
	Num odd = new Num() {
		public void print(int n) {
			
			for(int i=0; i<n;i++) {
				if(i%2 != 0)
					System.out.print(i + " ");
			}
			System.out.print("\n");
		}
		
	};
	Num even = new Num() {
		public void print(int n) {
				
				for(int i=0; i<n;i++) {
					if(i%2 == 0)
						System.out.print(i +" ");
				}
			}
	};
	public static void main(String[] args) {
		InclassEx1 odd = new InclassEx1(); 
		InclassEx1 even = new InclassEx1();
		odd.odd.print(10);
		even.even.print(10);
	}
}