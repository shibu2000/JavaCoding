package parcel;

public class Pascal2 {

	public static void main(String[] args) {
		int count;
		for (int i = 1; i <= 5; i++) {
			count = 1;
			for (int j = 5; j > 0; j--) {
				if (j <= i) {
					if (count % 2 != 0) {
						System.out.print(count);
					} else {
						System.out.print(" ");
					}
					count++;
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
