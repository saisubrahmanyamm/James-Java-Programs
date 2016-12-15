
public class BreakandContinue {

	public static void main(String args[]) {
		System.out.println("Starting loop:");
		for (int number = 0; number < 7; ++number) {
			System.out.println("in loop: " + number);
			if (number == 2) {
				continue;
			}
			System.out.println("Sai");
			if (number == 4) {
				break;
			}
			System.out.println("Subbu");
			// continue at head of loop
		}
		// break out of loop
		System.out.println("End of loop or exit via break");
	}
}
