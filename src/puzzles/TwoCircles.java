package puzzles;

import java.util.Scanner;

public class TwoCircles {
	static int circle(int x1, int y1, int x2, int y2, int r1, int r2) {
		int distSq = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
		int radSumSq = (r1 + r2) * (r1 + r2);
		if (distSq == radSumSq)
			return 1;
		else if (distSq > radSumSq)
			return -1;
		else
			return 0;
	}

	// Driver code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int cx1= sc.nextInt();
			int cy1=sc.nextInt();
			int r1=sc.nextInt();
			int cx2=sc.nextInt();
			int cy2=sc.nextInt();
			int r2=sc.nextInt();
			
			int t = circle(cx1, cy1, cx2, cy2, r1, r2);
			if (t == 1)
				System.out.println("Circle touch to" + " each other.");
			else if (t < 0)
				System.out.println("Circle not touch" + " to each other.");
			else
				System.out.println("Circle intersect" + " to each other.");
		}

	}
}
