import java.util.Scanner;

/* 
 * 8입력 (2*1 ~8*8) 까지 출력, 19 입력 (2*1 ~ 19*19) 출력
 */
public class GugudanExam1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		for (int j = 2; j <= num; j++) {
			for (int i = 1; i <= num; i++) {
				System.out.println(j + " X " + i + " = " + (j * i));
			}
		}
	}

}
