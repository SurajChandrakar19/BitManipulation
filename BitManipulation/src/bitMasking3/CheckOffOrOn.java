package bitMasking3;

public class CheckOffOrOn {
	public static void main(String[] args) {
		int n = 36;
		int mask = 1 << 5;
		String ans = (n & mask) > 0 ? "ON" : "OFF" ;
		System.out.println(ans);
	}

}
