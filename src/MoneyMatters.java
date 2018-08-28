import java.util.Scanner;

public class MoneyMatters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int friends;
		int friendships;
		int balanceCurrent;
		int balanceTotal = 0;
		int friend1LastCalc = 0;
		int friend2LastCalc = 0;
		int[] balance;
		int[] connectedFriends;

		friends = sc.nextInt();
		friendships = sc.nextInt();

		balance = new int[friends];
		connectedFriends = new int[friendships * 2];

		for (int i = 0; i < friends; i++) {
			balance[i] = sc.nextInt();
		}

		for (int i = 0; i < friendships * 2; i++) {
			connectedFriends[i] = sc.nextInt();
		}

		for (int i = 0; i < friendships * 2; i = i + 2) {
			if (!(friend1LastCalc == connectedFriends[i]) || !(friend2LastCalc == connectedFriends[i + 1])) {
				balanceTotal = 0;
			}
			balanceCurrent = 0;
			int bal1 = balance[connectedFriends[i]];
			int bal2 = balance[connectedFriends[i + 1]];
			balanceCurrent = bal1 + bal2;
			balanceTotal = balanceTotal + balanceCurrent;
			friend1LastCalc = connectedFriends[i];
			friend2LastCalc = connectedFriends[i + 1];
			if (bal1 > bal2) {
				balance[connectedFriends[i]] = balanceCurrent;
				balance[connectedFriends[i + 1]] = 0;
			} else if (bal2 > bal1) {
				balance[connectedFriends[i]] = 0;
				balance[connectedFriends[i + 1]] = balanceCurrent;
			}
		}
		if (balanceTotal == 0) {
			System.out.println("POSSIBLE");
		} else {
			System.out.println("IMPOSSIBLE");
		}
	}
}