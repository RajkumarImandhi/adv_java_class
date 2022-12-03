package Week1;

public class Point {

	int x,y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "(x,y)= (" + x + ", "+ y +")"; 
	}
	
	@Override
	public boolean equals(Object Obj) {
		Point P = (Point) Obj;
		return x == P.x && y == P.y;
	}
	
	public static void main(String[] args) {
		Point pt1 = new Point(5,6);
		Point pt2 = new Point(4,6);
		Point pt3 = new Point(5,6);
		
		System.out.println(pt1);
		System.out.println(pt2);
		System.out.println(pt3);
		
		if(pt1.equals(pt3))
			System.out.println("Objects are equal");
		else 
			System.out.println("Objects are not equal");

	}

}
