import java.util.Scanner;
public class DaysOfWeek {

	public static void main(String[] args) {
		String x = "";
		boolean isDay;
		String[] days ={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
	
		System.out.println("Type in a day of the week and I'll tell you how many letters are in the word, or type 'exit' to leave.");
		Scanner s = new Scanner(System.in);
		while(!x.equals("exit")){
		isDay = false;
			x=s.next();
			for(String d : days)
				if (d.equalsIgnoreCase(x))
					isDay=true;
		if (isDay)
			System.out.println(x+": "+x.length());
		else if (x.equalsIgnoreCase("exit"))
				break;
		else 
			System.out.println("Well, that's not a day of the week, but the answer is: "+x.length());
		}
		s.close();
		System.out.println("Program terminated.");
	}

}
