package Week7;


interface StringConcat{
	public String apply(String x, String y, String z);
}

public class Ex3 {

	public static void main(String[] args) {
		StringConcat s = (str1, str2, str3) -> str1 + str2 + str3 ;
		
		System.out.println("New String: " +s.apply("Raj", "kumar", " imandhi"));
	}

}
