
public class GugudanMethod {
	
	public static int[] multiply(int num) {
		int[] result = new int[9];
		for (int i = 0; i < result.length; i++) {
			result[i] = num * (i + 1);
		}		
		return result;
	}
	
	public static void print(int[] result) {
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}		
	}

	public static void main(String[] args) {
		
		for (int i = 2; i < 10; i++) {
			int[] result = multiply(i);
			print(result);
		}
	}

}
