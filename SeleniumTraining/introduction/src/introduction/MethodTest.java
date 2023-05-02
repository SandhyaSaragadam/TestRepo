package introduction;

public class MethodTest{

	public static void main(String[] args) {
		MethodTest d = new MethodTest();
		int name = d.getData();
		System.out.println(name);

		MethodTestDemo d1 = new MethodTestDemo();
		int Title = d1.getUserNumber();
		int s2 = MethodTestDemo.getStaticMethod();
		MethodTestDemo.getStaticMethod();
		System.out.println(s2);
		System.out.println(Title);
	}

	

	public int getData() {
		System.out.println(950258);
		return 3977;
	}
}