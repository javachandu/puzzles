package git.chandu.techolution.puzzles;

import java.util.Arrays;
import java.util.Scanner;

public class BuyingShowTickets {

	public static long times(int[] tickets, int p) {
		long times = 0;
		int[] temp = Arrays.copyOf(tickets, tickets.length); 
		for (int i = 0; i < tickets.length; i++) {
			temp[i] = tickets[i] - tickets[p];
		}
		for (int i = 0; i < tickets.length; i++) {
			if (temp[i] < 0)
				times += tickets[i];
			else {
				if (i <= p)
					times += tickets[p];
				else
					times += tickets[p] - 1;
			}
		}
		return times;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] tickets = new int[n];
		for (int i = 0; i < n; i++) {
			tickets[i] = sc.nextInt();

		}
		int p = sc.nextInt();
		long rounds = times(tickets, p);
		System.out.println(rounds);
		sc.close();
	}
}
