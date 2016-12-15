import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Collections {
	public static void main(String args[]) throws IOException {
		List<String> arrayList = new ArrayList<String>();
		HashSet<String> hashSet = new HashSet<String>();
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("how many:");
		int num = Integer.parseInt(br.readLine());

		System.out.println("Enter name for list: ");
		for (int i = 0; i < num; i++) {
			String a = br.readLine();
			arrayList.add(a);
		}

		System.out.println("\nEnter names for set: ");
		for (int i = 0; i < num; i++) {
			String b = br.readLine();
			hashSet.add(b);
		}

		System.out.println("\nEnter 1st Numbers and 2nd Names for map: ");
		for (int i = 0; i < num; i++) {
			int num1 = Integer.parseInt(br.readLine());
			String c = br.readLine();
			hashMap.put(num1, c);
		}

		System.out.println("LIST" + arrayList);
		System.out.println("SET" + hashSet);
		System.out.println("MAP" + hashMap);
	}

}
