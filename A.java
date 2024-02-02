package basketball;

public class A { 
	
	public static void main(String[] args) {
		int a = 34;
		String phone = "smartphone";
		String snack = "스낵";

		System.out.println("dd");
		System.out.println(a);
		System.out.println(phone);
		System.out.println();
		
		B b =  new B();
		
		System.out.println(snack);
		System.out.println(b.snack);
		b.method();
	}
}





class B {
		
	String snack= "snack";
	
	void method() {
		System.out.println("과자");
	}
	
}