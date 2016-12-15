
public class StringStringbufferStringbuilder {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		String s = "sai";
		s = "hi";
		System.out.println("It will print as '" + s
				+ "' Because String is immutable it will change value ,\nbut we lost reference to first String value sai and it consists in pool stream");
		StringBuffer sb = new StringBuffer("Java");
		sb = new StringBuffer("hi");
		System.out.println("\nNow We can see it is changing from java to " + sb + " because it is mutalbe.");

		for (int i = 0; i < 10000; i++) {
			s = s + "hello";
		}

		System.out.println("\nTime taken by String to add only '10000' iterations is : "
				+ (System.currentTimeMillis() - startTime) + "ms");
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			sb.append("hello");
		}
		System.out.println("\nTime taken by StringBuffer to append in 100000 iterations : "
				+ (System.currentTimeMillis() - startTime) + "ms");
		startTime = System.currentTimeMillis();
		StringBuilder sb2 = new StringBuilder("hi");
		for (int i = 0; i < 100000; i++) {
			sb2.append("hello");
		}

		System.out.println("\nTime taken by StringBuilder to append in 100000 iterations : "
				+ (System.currentTimeMillis() - startTime) + "ms");
	}
}
