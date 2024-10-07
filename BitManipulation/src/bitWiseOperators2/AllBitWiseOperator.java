package bitWiseOperators2;

public class AllBitWiseOperator {
	public static void main(String[] args) {
		int a = 5;
		int b = 9;
		System.out.println(a + "|" + b + "=" + (a|b));
		System.out.println(a + "&" + b + "=" + (a&b));
		System.out.println(a + "^" + b + "=" + (a^b));
		System.out.println("~" + b + "=" + (~b));
		System.out.println(a + "<<" + 1 + "=" + (a<<1));
		System.out.println(a + ">>" + 1 + "=" + (a>>1));
		System.out.println(a + ">>>" + 1 + "=" + (a>>>1));
		
	}

}
