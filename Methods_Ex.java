//java.lang package is the default package for every java class 
//import package name ;

public class Methods_Ex {
	int a = 90;
	int b = 2;
	public static int addOfTwo(int a, int b) {
		return a + b;
	}
	public void subOfTwo(int a, int b) {
		System.out.println(a - b);
	}
	public int mulOfTwo() {
		return a * b;
	}
	public void divOfTwo() {
		System.out.println(a / b);
	}
	public static void main(String[] args) {

		System.out.println(Methods_Ex.addOfTwo(45, 15));
		Methods_Ex obj = new Methods_Ex();
		obj.subOfTwo(45, 44);
		System.out.println(obj.mulOfTwo());
		obj.divOfTwo();
	}

}
