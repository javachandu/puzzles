package git.chandu.techolution.puzzles;

import java.util.Arrays;
import java.util.Scanner;

public class PsychometricTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] scores = new int[n];

		for (int a = 0; a < n; a++) {
			scores[a] = sc.nextInt();
		}
		int ll = sc.nextInt();
		int[] lowerLimits = new int[ll];
		for (int l = 0; l < ll; l++) {
			lowerLimits[l] = sc.nextInt();
		}

		int hl = sc.nextInt();
		int[] higherLimits = new int[hl];
		for (int h = 0; h < hl; h++) {
			higherLimits[h] = sc.nextInt();
		}

		int ans[] = solve(scores, lowerLimits, higherLimits);
		System.out.println(Arrays.toString(ans));

	}

	public static int[] solve(int[] scores, int[] lowerLimits, int[] higherLimits) {
		int solution[] = new int[lowerLimits.length];
		
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < lowerLimits.length; j++) {
				boolean b = between(scores[i], lowerLimits[j], higherLimits[j]);
				if (b) {
					solution[j]=solution[j]+1;
				}

			}

		}

		return solution;
	}

	public static boolean between(int i, int minValueInclusive, int maxValueInclusive) {
		return (i >= minValueInclusive && i <= maxValueInclusive);
	}

}
