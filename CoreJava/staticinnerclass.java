package Inheritence;
class Outer{
	int a;//non-static
	static int c=20;
	static class inner{
		int b;
		void display(){
			//System.out.println(a);
			System.out.println(c);
		}
	}
	
	
}
public class staticinnerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Outer.inner obj=new Outer.inner();
			obj.display();
	}

}
