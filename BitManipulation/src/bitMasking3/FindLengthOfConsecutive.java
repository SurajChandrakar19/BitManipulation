package bitMasking3;

public class FindLengthOfConsecutive {

	public static void main(String[] args) {
		
		int n = 7;
		//Big O(log N)
		System.out.println(lengthConsecutive(n));

	}

	private static int lengthConsecutive(int n) {
		int count = 0;
		while(n > 0) {
			n = (n &(n<<1));
			count++;
		}
		return count;
	}

}
