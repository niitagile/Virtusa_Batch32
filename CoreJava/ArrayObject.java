package Classes;

import java.util.Scanner;

public class ArrayObject {
	private int rollno;
	private String name;
	private double hindi,eng,maths,total,per;
	public void getinfo(){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr name");
		name=sc.nextLine();
		System.out.println("Enetr rollno");
		rollno=sc.nextInt();
		//sc.nextLine();
		
		System.out.println("Enetr hindi marks");
		hindi=sc.nextDouble();
		System.out.println("Enetr eng marks");
		eng=sc.nextDouble();
		System.out.println("Enetr maths marks");
		maths=sc.nextDouble();		
	}
	private void calc(){
	
		total=maths+eng+hindi;
		per=total/3;
	}
	public void display(){
		calc();
		System.out.println("name="+name);
		System.out.println("Total marks="+total);
		System.out.format(" percentage =%.2f ",per);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayObject obj[]=new ArrayObject[3];
		for(int i=0;i<obj.length;i++){
			obj[i]=new ArrayObject();
			obj[i].getinfo();
		
		}
		for(int i=0;i<obj.length;i++){
			
			obj[i].display();
		
		}
	}

}


