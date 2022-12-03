package Week3;
enum Operation{
	PLUS,MINUS, TIMES, DIV;
	 double apply(double a, double b){

		 switch (this){
			 case PLUS: 
				 return a + b;
			 case MINUS:
				 return a - b;
			 case TIMES:
				 return a * b;
			 case DIV:
				 return a / b;
			default:
				return 0;
		 }
	 }
}

public class InclassEx2 {

	public static void main(String[] args) {
		double a = 10;
		double b = 5;
		for (Operation op : Operation.values())
		 System.out.printf("%f %s %f = %f\n",a, op, b, op.apply(a, b));

	}

}
