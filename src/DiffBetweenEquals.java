
public class DiffBetweenEquals {

	public static void main(String arg[]) {
		String a = new String("abc");
		String b = new String("abc");

		System.out.println((a == b) + "\nYou are comparing objects not variables. It will not check memory");

		System.out.println(a.equals(b) + "\nBecause it check objects");

	}
}
