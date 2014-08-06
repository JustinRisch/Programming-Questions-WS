
public class SubCalc implements calc{
	public double addition(double x, double y){
		return x+y;
	}
	public double subtraction(double x, double y){
		return x-y;
	}
	public double multiplication(double x, double y){
		return x*y;
	}
	public double division(double x, double y){
		return x/y;
	}
}

interface calc {
	double addition(double x, double y);
	double subtraction(double x, double y);
	double multiplication(double x, double y);
	double division(double x, double y);
}