ublic class Keyword {
	String myname = null;
		Keyword(){
			System.out.println("hello");
		}
		void setname(String myname)
		{
			myname=myname;
			
		}

	public static void main(String[] args) {
        Keyword t1 = new Keyword();
        t1.setname ("MARK");
        System.out.println(t1.myname);
	}

}
