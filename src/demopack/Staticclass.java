package demopack;

public class Staticclass {

	public static void main(String[] args) {
		System.out.println("This is Begining");
		Four.bengalore();
		Four.chennai();
		Four f1=new Four();
		f1.mumbai();
	}

}
class Four{
	public static void bengalore() {
		System.out.println("This is Bangalore");
	}
	public static void chennai() {
		System.out.println("This is Chennai");
	}
	public void mumbai() {
		System.out.println("This is Mumbai");
	}
}

