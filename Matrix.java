import java.util.Random;

public class Matrix {

	public static void main(String[] args) throws InterruptedException {

		char[] znak = new char[80];

		Random random = new Random();
		int z = 0;
		while (true) {
			while (z < random.nextInt(10 - 1)) {
				znak[random.nextInt(80 - 1)] = '_';
				znak[random.nextInt(80 - 1)] = ' ';
				znak[random.nextInt(80 - 1)] = '_';
				znak[random.nextInt(80 - 1)] = ' ';
				znak[random.nextInt(80 - 1)] = '_';
				znak[random.nextInt(80 - 1)] = ' ';
				znak[random.nextInt(80 - 1)] = '_';
				znak[random.nextInt(80 - 1)] = ' ';

				for (int i = 0; i < znak.length; i++) {
					if (znak[i] != ' ') {
						znak[i] = (char)(random.nextInt(126 - 33 - 1) + 33);
					}
				}
				for (int i = 0; i < znak.length; i++) {
					System.out.print(znak[i] + " ");
					Thread.sleep(1);
				}
				System.out.println();
				z++;
			}
			z = 0;
		}

	}
}
