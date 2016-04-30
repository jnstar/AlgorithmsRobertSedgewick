package Foundamentals;

public class Ex_1_1_20 {
	public static double calLnFacN(int N)
	{// calculate Ln(N!) by recursive
		if (N == 0 || N == 1)
			return 0;
		else if (N > 1)
			return Math.log10(N) + calLnFacN(N - 1);
		else
		{
			System.out.println("Input N > 0 !");
			return Double.NaN;
		}
	}
	
	public static void main(String[] args)
	{// test
		System.out.println(calLnFacN(10));
	}
}
