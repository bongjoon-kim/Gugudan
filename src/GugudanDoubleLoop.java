
public class GugudanDoubleLoop {

	public static void main(String[] args) {

		for (int j = 2 ; j < 10 ; j++) {
			System.out.println(j + " 단");
			
			for (int i = 2; i < 10; i++) {
				System.out.println(j + " * " + i + " = " + (j * i));
			}
		}
	}

}
