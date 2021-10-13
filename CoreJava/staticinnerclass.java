package Inheritence;
class Outer{
	int a;//non-static
	static int c=20;
	//inner class starting
	static class inner{
		int b=30;
		void display(){
			//System.out.println(a);
			System.out.println(c);
		}
	}
		//inner class ending
		void show(){
			System.out.println(a);
			//System.out.println(b);
			Outer.inner obj=new Outer.inner();
			obj.display();
		}
	
	
	
}
public class staticinnerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Outer.inner obj=new Outer.inner();
			obj.display();
	}

}
