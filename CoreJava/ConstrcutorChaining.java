package Classes;
class ClassA{
	private int id;
	private String name;
	ClassA(){
		this.id=0;
		this.name=null;
	}
	ClassA(int id){
		this.id=id;
	}
	ClassA(int id,String name){
		this(id);//calling Constructor2. it must be the first line in block
		this.name=name;
	}
	
}
public class ConstrcutorChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA obj=new ClassA();//Constructor1
		ClassA obj1=new ClassA(23);//Constructor2
		ClassA obj2=new ClassA(12,"Anil");//Constructor2 Constructor 3
		
	}

}
