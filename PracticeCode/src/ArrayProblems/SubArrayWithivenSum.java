package ArrayProblems;

import java.lang.reflect.Array;
import java.util.ArrayList;

//import java.util.ArrayList;

public class SubArrayWithivenSum {
	static ArrayList<Integer> sumPosition(int[] arr, int s) {
		int tmp = 0, prev = 0;
		ArrayList<Integer> index = new ArrayList<Integer>();
		index.add(1);
//		index.add(2);
//		int[] position = new int[2];
//		position[0] = 1;
		for (int i = 0; i < arr.length; i++) {

			tmp += arr[i];

			if (tmp == s) {
//				position[0] = i + 1;
				index.add(1, i + 1);
				break;
			}
			if (tmp > s) {
				i = (prev += 1) - 1;
//				position[0] = i + 2;
				index.add(0, i + 2);
				tmp = 0;
			}
		}
		ArrayList<Integer> pos = new ArrayList<>();
		pos.add(index.get(0));
		pos.add(index.get(1));
		return pos;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 24;
//		int[] result = sumPosition(arr, sum);

//		for (int i = 0; i < result.length; i++) {
//			System.out.print(result[i] + " ");
//		}
		sumPosition(arr, sum).forEach((data) -> {
			System.out.print(data + " ");
		});

	}
}
