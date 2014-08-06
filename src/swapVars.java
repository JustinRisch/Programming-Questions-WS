
public class swapVars {

	public static void main(String[] args) {
		int a = 1, b = 2;
		System.out.println("a="+a+", b="+b);
		//Using math to swap the variables. A+B = 3. A = 3-1 = 2. B = B - A = 3 - 2. Values swapped.
		b+=a; a=b-a; b-=a;		
		System.out.println("a="+a+", b="+b);
	}

}
