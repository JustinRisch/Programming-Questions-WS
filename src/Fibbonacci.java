
public class Fibbonacci {
	public static void main(String[] args) {
		int a = 0, b = 1;
		System.out.print(a+" ");
		for (byte i = 0; i<8; i++){
			System.out.print (b+" ");
			//increment B to the next number in the sequence, set A to the number B was last.
			b+=a; a=b-a;
		}
	}

}
