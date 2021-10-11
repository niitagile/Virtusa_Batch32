package Classes;

public class GetterSetterExample {
	private int rollno;
	private String name, course="Java";
	
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetterSetterExample gse= new GetterSetterExample();
		gse.setRollno(1);
		gse.setName("heena");
		System.out.println("rollno="+gse.getRollno());
		System.out.println("name="+gse.getName());
		System.out.println("course="+gse.getCourse());
	}

}
