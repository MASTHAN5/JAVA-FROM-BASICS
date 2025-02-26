//this keyword
public class TeacherName {
	String myname=null;
	
	TeacherName()
	{
		System.out.println("Hello");
	}
	
	void setMyname(String myname) {
		this.myname =myname; // this part
	}
	

	public static void main(String[] args) {
		TeacherName t1 = new TeacherName();
		t1.setMyname("Mark");
System.out.println(t1.myname);
	}

}
