package Foundamentals;

public class ClassicStaticMethodsEthan {
	public static int abs(int x)
	{
		if (x < 0) 	return -x;
		else			return x;
	}
	
	public static double abs(double x)
	{
		if (x < 0.0) return -x;
		else return x;
	}
	
	public static boolean isPrime(int N)
	{
		// N < 2
		if (N < 2) return false;
		// i*i <= N;   "<="
		for (int i = 2; i*i <= N; i++)
		{
			if (N % i == 0) return false;
		}
		return true;
	}
	
	public static double sqrt(double c)
	{
		// Newton-Raphson method 
		if (c < 0) return Double.NaN;
		double err = 1e-15;
		double t = c;
		while (Math.abs(t - c/t) > err * t)
			t = (c/t + t) / 2.0;
		return t;
	}
	
	public static double hypotenuse(double a, double b)
	{
		return Math.sqrt(a*a + b*b);
	}
	
	public static double H(int N)
	{// 1/1 + 1/2 + 1/3 + .... + 1/N
		double sum = 0.0;
		for (int i = 1; i <= N; i++)
			sum += 1.0 / i;
		return sum;
	}
	
	public static void main(String[] args)
	{
		
	}
}






