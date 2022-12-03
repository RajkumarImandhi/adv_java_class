package Week9;

interface Decorable {
    String color="Red";
}
public class test implements Decorable{
   public static void main(String[] args) {
       System.out.println(test.color);
  }
}
