package bitMasking3;

public class OffTheParticulerBit {
	public static void main(String[] args) {
		int n = 36;
		int position = 5;
		//first way
		int mask = ~(1 << position);
		System.out.println(n & mask);
		//second way mask = 1 << position;
		System.out.println(n ^ mask);
	}
}
