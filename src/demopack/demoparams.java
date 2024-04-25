package demopack;

public class demoparams {

	public static void main(String[] args) {
		System.out.println("This is Begining");
		Three t1=new Three();
		t1.add(25,32);
		t1.add(59,61);
		t1.add("This is bangalore");
		
	}

}
class Three{
	public void add(int a,int b){
		int c=a+b;
		System.out.println(c);
	}
	public void add(String msg){
		System.out.println("msg");
	}
}
 