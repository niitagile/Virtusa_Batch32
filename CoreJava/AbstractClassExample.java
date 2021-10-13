package Inheritence;

abstract class Microwave{
		int temp;
		Microwave(int temp){
			this.temp=temp;
		}
		public abstract void display();
		//public abstract void show();
		public void setStart(){
			System.out.println("on");
		}
	
}
class Cake extends Microwave{

	Cake(int temp) {
		super(temp);
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(temp);
	}
	
}
public class AbstractClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Microwave obj=new Microwave();	can't create object
		Microwave obj=new Cake(102);
		obj.display();
		obj.setStart();
	}

}
