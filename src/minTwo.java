
public class minTwo {
	public static void main(String[] args) {
		int a = 0, b = 1, c = 2;
		System.out.println("Min of a=0, b=1: "+min(a,b));
		System.out.println("Min of c=2, b=1: "+min(c,b));
	}
	//returns the smaller of two numbers.
	public static int min(int x, int y){
			return (x<y)?x:y;
	}
}
