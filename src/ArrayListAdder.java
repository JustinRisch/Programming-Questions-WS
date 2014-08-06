import java.util.ArrayList;
public class ArrayListAdder {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		int evenSum=0, oddSum=0;
		for (Integer i=15; i<25; i++)
			nums.add(i);
		for (int x : nums)
			if (x%2==0)
				evenSum+=x;
			else 
				oddSum+=x;
		System.out.println("Sum of evens: "+evenSum
				+"\nSum of odds: "+oddSum);
		ArrayList<Integer> nums2 = new ArrayList<Integer>();
		for(int x : nums){
			for(int i=2;i<=x/2; i++){
				if (x%i==0){
					nums2.add(x);
					break;
				}
			}
		}
		nums = nums2;
		System.out.print("Non-primes: ");
		for (int x : nums)
			System.out.print(x+" ");
	}

}
