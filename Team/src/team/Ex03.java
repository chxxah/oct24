package team;

import java.util.Arrays;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// 문제
		// 음수가 아닌 수들이 주어졌을 때 그 수들을 이어서 만들 수 있는 가장 큰 수를 구하시오.
		// 예를 들어 [1,2,3]이 주어졌을 때 만들 수 있는 가장 큰 수는 321이고,
		// [3, 30, 34, 5, 9] 가 주어지면 만들 수 있는 가장 큰 수는 9534330이다.

		// compareTo :문자열로 이어붙인 결과를 나타냅니다
		// 두 문자열이 같으면 0을 반환하고,
		// 첫 번째 문자열이 두 번째 문자열보다 작으면 음수를 반환하고,
		// 첫 번째 문자열이 두 번째 문자열보다 크면 양수를 반환합니다.
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] split = input.split(" ");
		String[] numbers = new String[split.length];

		for (int i = 0; i < split.length; i++) {
			numbers[i] = split[i];
		}

		// System.out.println(Arrays.toString(numbers));

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				// 1 15 8 72 9
				//
				// System.out.print(i+"-1: " + split[i] + split[j]);
				// System.out.print(" " + i +"-2 : " + split[j] + split[i]);
				// System.out.println(" ");
				if ((split[i] + split[j]).compareTo(split[j] + split[i]) < 0) {
					// System.out.println("(" + i + "" + j + ")");
					String temp = split[i];
					split[i] = split[j];
					split[j] = temp;
					// System.out.println(split[i] + split[j]);
					System.out.println(i + "" + j + Arrays.toString(split));
				}
			}
		}
		// System.out.println(Arrays.toString(split));
		String largestNum = String.join("", split);
		System.out.println("만들수 있는 가장 큰수 : " + largestNum);
	}
}