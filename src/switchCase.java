import java.util.Scanner;
import java.util.Date;
public class switchCase {

	public static void main(String[] args) {
		int cmd = -1; 
		Scanner s = new Scanner(System.in);
		while (cmd!=0){
			System.out.println("Enter a number to select a function:\n"
					+ "1-Square root\n"
					+ "2-Display Today's Date\n"
					+ "3-Split into array.");

			cmd = s.nextInt();
			switch (cmd) { 
			case 1: 
				System.out.print("Enter a number to be rooted: ");
				double rooter = s.nextDouble();
				rooter = Math.pow(rooter, .5);
				System.out.println(rooter);
				break;
			case 2: 
				System.out.println("Today's date is: " + new Date());
				break;
			case 3: 
				System.out.println("I am Learning Core Java");
				System.out.println("The third index stores: "+"I am Learning Core Java".split(" ")[3]);
			}
		}
		s.close();
	}

}
