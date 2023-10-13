package ArrayProblems;

public class FindMissingNumber {
	static int findMissing(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
			}
		}

		int count = 1;
		boolean flag = false;

		for (int i = 0; i < arr.length; i++) {
			if (count != arr[i]) {
				flag = true;
				break;
			}
			count++;
		}

		return count;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 9, 2, 8, 3, 7, 4, 6 };

		findMissing(arr);
	}
}
