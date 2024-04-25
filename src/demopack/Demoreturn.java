package demopack;

public class Demoreturn {

	public static void main(String[] args) {
		System.out.println("This is Begining");
		
		Five f1=new Five();
		int ss = f1.add(10, 20);
		int c=f1.add(25, 35);
		System.out.println(c);
		
		int sumoftwonums=f1.add(52, 30);
		System.out.println(sumoftwonums);

		int xy=f1.mutliplication(20, 5);
		System.out.println("multiplication of 20 & 5 is "+xy);
	}

}
class Five {
	public int add(int a,int b) {
		int c=a+b;
		return c;
	}
	public int mutliplication(int a,int b) {
		int c=a*b;
		return c;
	}
	public void bengalore() {
		System.out.println("This is Bengalore");
	}
}