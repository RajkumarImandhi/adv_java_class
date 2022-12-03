package Week9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Person{
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	int age;
	Person (String name, int age){
		this.name = name;
		this.age = age;
	}
	
}

class User{
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	int age;
	
	@Override
	public String toString() {
		return "{" + name + "," + age + "}";
	}
}

public class Ex2 {

	public static void main(String[] args) {
		List<Person> data = new ArrayList<Person>();
		
		data.add(new Person("John", 27));
		data.add(new Person("Sarah", 37));
		data.add(new Person("Sarah", 24));
		data.add(new Person("Peter", 22));
		data.add(new Person("Ajay", 29));
		data.add(new Person("Susan", 22));
		
		List<User> users = new ArrayList<User>();
		
		
		//VERSION1
//		for(Person p: data) {
//			User usr = new User();
//			usr.setName(p.getName());
//			usr.setAge(p.getAge());
//			users.add(usr);
//		}
		
//		users = data.stream().map(p-> {
//			return extracted(p);
//		}).collect(Collectors.toList());
//		for( User usr: users)
//			System.out.println(usr);
		
		data.stream().map(p -> toExtract(p))
		.collect(Collectors.toList())
		.stream().filter(usr->usr.getAge()>30)
		.forEach(System.out::println);
	}

	private static User toExtract(Person p) {
		User usr = new User();
		usr.setName(p.getName());
		usr.setAge(p.getAge());
		return usr;
	}

}
