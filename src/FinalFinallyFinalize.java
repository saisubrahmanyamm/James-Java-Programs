import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinalFinallyFinalize {
	// Finalize() is a method which clean up before processing
	public static void Finalize() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter:");
		String s = br.readLine();
		System.out.println(s);

	}

	public static void main(String args[]) throws IOException {
		// Final is a keyword that means it cannot change value or inherit
		final int number = 300;
		try {

			int number1 = 500;// Change "number1" to "number" for working of final
			// It will not execute because we have declared Number variable as
			// final keyword
			System.out.println("Executing Try block");
		} catch (Exception e) {
			System.out.println(e);
		}
		// Finally is a block and runs guaranteely if program executes without
		// error
		finally {
			System.out.println("\nI'm in Finally. Try block will not execute");

		}
		System.out.println("\nNow i am calling Finalize.");
		Finalize();
		FinalFinallyFinalize f1 = new FinalFinallyFinalize();
		f1 = null;
		System.gc();
	}
}
