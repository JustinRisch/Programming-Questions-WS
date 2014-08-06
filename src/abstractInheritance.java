
public class abstractInheritance extends stringChecker{

	public static void main(String args[]){
		System.out.println("justin has upper = " +hasUpper("justin"));
		System.out.println("Justin has upper = " +hasUpper("Justin"));
		System.out.println("justin to upper = " +toUpper("justin"));
		System.out.println("String addition 23+10 = " + addTen("23"));
	}
	
}

abstract class stringChecker{
	public static boolean hasUpper(String testVar){
		if (testVar.toLowerCase().equals(testVar))
			return false;
		else 
			return true;
	}
	public static String toUpper(String temp){
		return temp.toUpperCase();
	}
	public static Integer addTen(String x){
		return Integer.parseInt(x)+10;
	}
}