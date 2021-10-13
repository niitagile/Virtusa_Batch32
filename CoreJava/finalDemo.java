package Inheritence;
/*final class Student{
	final int fees=700;
	final void show(){}
}

class ABC extends Student{
	void display(){
		fees=900;
	}
		void show(){
			
		}
}*/

class StudentDetails{
	
	String name;
	static String course="Btech";// it will store in pool. it is not the part of the objects.
	// it is sharable value among all objects
	
	static void staticMethod(){
			//name="geet"; non-static member- can't be accessed by static method
		course="BCA";
	}
	void display(){
		System.out.println(name);
		System.out.println(course);
	}
	public StudentDetails(String name) {
		super();
		this.name = name;
	}
	
	
}


public class finalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetails s1=new StudentDetails("Jyoti");
		
		s1.display();
		StudentDetails s2=new StudentDetails("Manisha");
		StudentDetails.staticMethod();
		s2.display();
		s1.display();
	}

}
