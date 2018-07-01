package git.chandu.techolution.puzzles;

import java.util.Scanner;

public class FindTheWinner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] andrea = new int[n];

		String gamePlan = null;

		for (int a = 0; a < n; a++) {
			andrea[a] = sc.nextInt();

		}
		int n1 = sc.nextInt();
		int[] maria = new int[n1];
		for (int m = 0; m < n1; m++) {
			maria[m] = sc.nextInt();

		}
		gamePlan = sc.next();

		String winner = whoIsTheWinner(andrea, maria, gamePlan);
		System.out.println(winner);
		sc.close();

	}

	public static String whoIsTheWinner(int[] andrea, int[] maria, String gamePlan) {
		String winner = null;
		int a = 0;
		int m = 0;
		if (gamePlan.equalsIgnoreCase("even")) {
			for (int i = 0; i < andrea.length; i += 2) {
				a += andrea[i] - maria[i];
				m += maria[i] - andrea[i];
			}
		}
		if (gamePlan.equalsIgnoreCase("odd")) {
			for (int i = 1; i < andrea.length; i += 2) {
				a += andrea[i] - maria[i];
				m += maria[i] - andrea[i];
			}

		}
		if (a > m)
			winner = "Andrea";
		if (m > a)
			winner = "Maria";
		if (a == m)
			winner = "Tie";

		return winner;

	}

}
