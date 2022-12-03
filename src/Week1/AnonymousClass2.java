package Week1;

interface Iterator {
	public boolean hasNext();
	public Object next();
}

public class AnonymousClass2 {

	int total;
	AnonymousClass2(int total){
		this.total = total;
	}
	
	Iterator iter = new Iterator() {
		int idx = 0;
		public boolean hasNext() {
			return idx < total ? true : false;
		}
		public Object next() {
			return ++idx;
		}
	};
	public static void main(String[] args) {
		AnonymousClass2 obj = new AnonymousClass2(10);
		
		while(obj.iter.hasNext()) {
			System.out.println(obj.iter.next());
		}
	}

}
