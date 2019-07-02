import java.util.Scanner;
/*
 * 문자열 "8,7" 입력시 87단 2 * 1 ... 2 * 7, 3 * 1 ... 3 * 7, ... , 8 * 1 ... 8 * 7 까지 구현 
 */
public class GugudanExam2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		String[] splitedValue = str.split(",");
		
		int num1 = Integer.parseInt(splitedValue[0]);
		int num2 = Integer.parseInt(splitedValue[1]);
		
		for (int j = 2; j <= num1; j++) {
			for (int i = 1; i <= num2; i++) {
				System.out.println(j + " X " + i + " = " + (j * i));
			}
		}

	}

}
