package git.chandu.techolution.puzzles;

import java.util.Scanner;

public class ConsecutiveSum {

	public int count(int n) {
		
		int count = 0;
		for (int c = 1; c * (c + 1) < 2 * n; c++) {
			float a = (float) ((1.0 * n - (c * (c + 1)) / 2) / (c + 1));
			if (a - (int) a == 0.0)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ConsecutiveSum csum = new ConsecutiveSum();
		System.out.println(csum.count(n));
		sc.close();
	}
}