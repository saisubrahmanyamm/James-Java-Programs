
class Test {

	public static int a = 6;
	public int b = 10;
}

public class StaticInstance {

	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test();

		t1.a = 3;// Because int 'a' is a static element it can't be changed many
					// times.
					// what ever it is changed lastly will have that value only.
		t1.b = 20;
		t2.a = 5;
		t2.b = 15;

		System.out.println("Expected : 3 but output : " + t1.a);
		System.out.println("Expected : 20 and output : " + t1.b);
		System.out.println("Expected : 5 and output : " + t2.a);
		System.out.println("Expected : 15 and output : " + t2.b);

	}

}