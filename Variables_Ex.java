
public class Variables_Ex {
	int empId = 1111;// global variable instance 4bytes
	static int countryCode = 91;// 4 bytes

	public static void main(String[] args) {

		byte age = 22;
		int salary = 9230902;
		float marks = 234.4434334308921f;
		double result = 234.4434334308921f; // local variables

		System.out.println(age + "   " + salary + "   " + marks + "   " + result);

		System.out.println(Variables_Ex.countryCode);

		// classname objname=new Classname();
		Variables_Ex obj = new Variables_Ex();

		System.out.println(obj.empId);

	}
}
