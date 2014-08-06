import java.util.Scanner;
public class SimpleInterest {

	public static void main(String[] args) {
		double principal, rate, years;
		Scanner s = new Scanner(System.in);
		System.out.print("Please enter the principal: ");
		principal=s.nextDouble();
		System.out.print("Please enter the rate: ");
		rate = s.nextDouble();
		System.out.print("Please enter the number of years: ");
		years = s.nextDouble();
		s.close();
		System.out.println("The interest is: "+ principal*rate*years);
	}

}
