
public class GugudanMethodStr {

	public static String[] multiply(int num) {
		String[] result = new String[9];
		
		for (int i = 0; i < result.length; i++) {
			result[i] = num + " X " + (i + 1) + " = " + num * (i + 1);
		}		
		return result;
	}
	
	public static void print(String[] result) {
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}		
	}

	public static void main(String[] args) {
		
		for (int i = 2; i < 10; i++) {
			String[] result = multiply(i);
			System.out.println("구구단 : " + i + "단");
			print(result);
		}
	}

}
