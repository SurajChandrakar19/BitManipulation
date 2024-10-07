package introduction1;

public class IntegerToBinary {
	public static void main(String[] args) {
		String binary = integerToBinary(45);
		System.out.println(binary);
		
		int desimal = binaryToDesimal(binary);
		System.out.println(desimal);
	}

	private static int binaryToDesimal(String n) {
		int desimal = 0;
		int into = 1;
		for(int i = n.length()-1; i >= 0 ; i--) {
			if(n.charAt(i) == '1') {
				desimal = desimal + into;
			}
			into *= 2;
		}
		return desimal;
	}

	private static String integerToBinary(int n) {
		String binary = "";
		while(n >= 1) {
			binary = (n % 2) + binary;
			n = n / 2;
		}
		return binary;
	}

}
