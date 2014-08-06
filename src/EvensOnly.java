
public class EvensOnly {
	public static void main(String args[]){
		int[] hundred = new int[100];
		for (int i = 0; i < 100; i++) { 
			hundred[i]=i+1;
			if (i%2==1)
				System.out.print(hundred[i]+" "); 
		}
	}
}
