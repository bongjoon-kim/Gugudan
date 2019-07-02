
public class GugudanMain {

	public static void main(String[] args) {
		
		GugudanClass gugu = new GugudanClass();
		
		for (int i = 2; i < 10; i++) {
			int[] result = gugu.multiply(i);
			gugu.print(result);
		}
	}

}
