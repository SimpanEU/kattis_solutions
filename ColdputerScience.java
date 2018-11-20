import java.util.Scanner;

public class ColdputerScience {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int daysBelowZero = 0;
		int daysTotal = sc.nextInt();
		int[] temperatures = new int[daysTotal];

		for (int i = 0; i < daysTotal; i++) {
			temperatures[i] = sc.nextInt();
			if (temperatures[i] < 0) {
				daysBelowZero++;
			}
		}

		System.out.println(daysBelowZero);
	}

}
