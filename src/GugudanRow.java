
public class GugudanRow {

	public static void main(String[] args) {
		
		for (int j = 2; j < 10; j++) {
			System.out.print(j + " 단 \t\t");
		}
		System.out.println();
		
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.print(j + " * " + i + " = " + (i * j) + "\t");
			}
			System.out.println();
		}

	}

}
