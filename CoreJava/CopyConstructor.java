package Day2;

public class CopyConstructor {
	private int rollno;
	private String name,grade;
	private float m1,m2,m3,avg,total;
	
	public CopyConstructor() {
		
		rollno=0;
		name="abc";
		grade="fail";
		m1=0.0f;
		m2=30;
		m3=30;
		
	
	}
	public CopyConstructor(CopyConstructor cpy) {
			//this();//calling statement for default constrcutor
		this.rollno = cpy.rollno;
		this.name = cpy.name;
		this.m1 = cpy.m1;
		this.m2 = cpy.m2;
		this.m3 = cpy.m3;
		
	}
	
	private void calc(){
		total=m1+m2+m3;
		avg=total/3;
		if(avg>=80)
			grade="A";
		else if (avg >=60 && avg <80)
			grade="B";
		else if (avg >=40 && avg <60)
			grade="C";
		else
			grade="Fail";

	}
	public void display(){
		calc();
		System.out.println("Rollno="+rollno);
		System.out.println("Grade="+grade);
	}


public static void main(String[] args) {
	
	CopyConstructor res=new CopyConstructor();
	res.display();
	CopyConstructor res1=new CopyConstructor(res);
	res1.display();

}

}


