package git.chandu.techolution.puzzles;

import java.util.Scanner;

public class InTheFuture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int k = sc.nextInt();
		int p = sc.nextInt();
		int mindays = solve(a, k, p);
		if (mindays == -1)
			System.out.println("It is not possible");
		else
			System.out.println(mindays);

	}

	public static int solve(int a, int k, int p) {
		if (k > a) {
			int solution = (int) Math.floor(p / (k - a));
			return solution + 1;
		} else
			return -1;

	}

}
