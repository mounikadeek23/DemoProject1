package demopack;

public class demohello {

	public static void main(String[] args) {
		System.out.println("This is Begining");
		one o1=new one();
		o1.bengalore();
		o1.chennai();
		two t1=new two();
		t1.mumbai();

	}

}
class one{
	public void bengalore() {
		System.out.println("This is Bangalore");
	}
	public void chennai() {
		System.out.println("This is Chennai");
	}
	public void mumbai() {
		System.out.println("This is Mumbai");
	}
}
class two{
	public void mumbai() {
	System.out.println("This is Mumbai");
	}
}