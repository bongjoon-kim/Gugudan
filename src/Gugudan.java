import java.util.Scanner;

public class Gugudan {
	
	public static void main(String[] args) {
		
		System.out.println("구구단 중 출력할 단은?");
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		
		if (number >= 2 && number <= 9 ) {
			System.out.println(number + " 단");
			
			for (int i = 1; i < 10; i++) {
				System.out.println(number + " * " + i + " = " + (number * i));
			}
			System.out.println();
			
			int i = 1;
			while ( i < 10) {
				System.out.println(number + " * " + i + " = " + (number * i));
				i++;
			}
			
		} else {
			System.out.println("2~9 사이의 정수를 입력하세요.");
		}
	}
	
}
