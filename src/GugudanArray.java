import java.util.Scanner;

public class GugudanArray {

	public static void main(String[] args) {
		
		int[] result = new  int[9];
		
		System.out.println("구구단 출력: 2~9 사이의 정수 입력");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		if (num >= 2 && num <= 9) {
		
			System.out.println(num + " 단");
	
			for (int i = 1; i < result.length; i++) {
				result[i-1] = num * i;
			}
			
			for (int i = 1; i < result.length; i++) {
				System.out.println(num + " * " + i + " = " + result[i-1]);
			}
		} else {
			System.out.println("2~9 사이의 정수가 아닙니다.");
		}
	}

}
