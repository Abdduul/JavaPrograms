import java.util.Random;
import java.util.Scanner;

public class BatuGuntingKertas {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String[] bgk = { "b", "g", "k" };
			String pilKomputer = bgk[new Random().nextInt(bgk.length)];

			String pilPemain;

			while (true) {
				System.out.println("Tuliskan Pilihanmu (b, g, k)");
				pilPemain = scanner.nextLine();
				if (pilPemain.equals("b") || pilPemain.equals("g") || pilPemain.equals("k")) {
					break;

				}
				System.out.println(pilPemain + "bukan lah Batu, Gunting Maupun Kertas");
			}

			System.out.println("Komputer Milih: " + pilKomputer);

			if (pilPemain.equals(pilKomputer)) {
				System.out.println("Game Seri!!!");
			} else if (pilPemain.equals("b")) {
				if (pilKomputer.equals("g")) {
					System.out.println("Kamu Menang!");
				} else if (pilKomputer.equals("k")) {
					System.out.println("Kamu Kalahh!!");
				}
			} else if (pilPemain.equals("g")) {
				if (pilKomputer.equals("k")) {
					System.out.println("Kamu Menang!");
				} else if (pilKomputer.equals("b")) {
					System.out.println("Kamu Kalahh!!");
				}
			} else if (pilPemain.equals("k")) {
				if (pilKomputer.equals("b")) {
					System.out.println("Kamu Menang!");
				} else if (pilKomputer.equals("g")) {
					System.out.println("Kamu Kalahh!!");
				}
			}

			System.out.println("Maim Lagi? (y/n)");
			String mainLagi = scanner.nextLine();

			if (!mainLagi.equals("y")) {
				break;

			}
		}
		scanner.close();
		
	}
}
