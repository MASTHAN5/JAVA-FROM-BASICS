public class constructionvalue {
  int mark;
  String name;
  constructionvalue(int a,String b){
	  
	  mark =a;
	  name =b;
  }
	public static void main(String[] args) {
		constructionvalue obj1 = new constructionvalue(32,"jack");
		constructionvalue obj2 = new constructionvalue(42,"jakkkky");
		System.out.println(obj1.mark);
		
		
	}

}
