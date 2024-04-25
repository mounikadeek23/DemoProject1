package demopack;


public class DemoConstructor {

	public static void main(String[] args) {
		System.out.println("This is Beginning");
		 
		Nine n1=new Nine();
		Nine n2 = new Nine(12,48);
		Nine n3 = new Nine(11,45,10);
		n1.bengalore();
	}

}
		class Nine{
			Nine(){
			System.out.println("This is Nine");
		}
		Nine(int a,int b){
			int c=a+b;
			System.out.println(c);
		}
		Nine(int a,int b,int c ){
			int d=a+b+c;
			System.out.println(d);
		}
		public void bengalore() {
			System.out.println("This is Bangalore");
		}
		}
		