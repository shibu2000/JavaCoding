package StringProblem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class String01 {

	public static void main(String[] args) {
		Map<String, String> table = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		int entries;
		String key, value;

		System.out.println("Enter the number of entries: ");
		entries = sc.nextInt();

		for (int i = 0; i < entries; i++) {
			System.out.println("Enter The key: ");

			key = sc.next();

			System.out.println("Enter The Value");

			value = sc.next();

			table.put(key, value);
		}

		String greatest = "0";
		for (String v : table.values()) {
			if (Integer.parseInt(greatest) < Integer.parseInt(v)) {
				greatest = v;
			}
		}

		int num = Integer.parseInt(greatest);
		int highLen = 0;

		while (num > 0) {
			num /= 10;
			highLen++;
		}

		for (String k : table.keySet()) {
			int vLength = table.get(k).length();

			if (vLength < highLen) {
				int diff = highLen - vLength;
				for (int i = 0; i < diff; i++) {
					System.out.println("==========OUTPUT==========");
					table.put(k, "0" + table.get(k));
//
				}
			}
		}

		table.forEach((k, v) -> {
			System.out.println(k + "\t" + v);
		});

		sc.close();
	}

}
