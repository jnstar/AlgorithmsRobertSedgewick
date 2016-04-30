package Foundamentals;

public class ArrayMethodsEthan {
	public static void arrayPrint(double[] a)
	{
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]);
			System.out.print('\t');
		}
		System.out.print('\n');
	}
	public static double getMax(double[] a)
	{
		double max = a[0];
		// i = 1, start from index 1, cause index 0 had been assigned to max
		for (int i = 1; i < a.length; i++ )
		{
			if (a[i] > max) 
				max = a[i]; 
		}
		return max;
	}
	
	public static double mean(double[] a)
	{
		int N = a.length;
		// It's demonstrate sum is double type by assigned with 0.0, 
		double sum = 0.0;
		for (int i = 0; i < N; i++)
		{
			sum += a[i];
		}
		return sum / N;
	}
	
	public static double[] copyArray(double[] a)
	{
		int N = a.length;
		double[] b = new double[N];
		for (int i = 0; i < N; i++)
		{
			b[i] = a[i];
		}
		return b;
	}
	
	public static void reverseArray(double[] a)
	{
		int N = a.length;
		// "i < N/2" is the most important part 
		for (int i = 0; i < N/2; i++)
		{
			double temp = a[i];
			a[i] = a[N-1-i];
			a[N-i-1] = temp;
		}
	}
	
	public static double[][] matrixTimes(double[][] a, double[][] b)
	{
		int N = a.length;
		double[][] c = new double[N][N];
		for (int i = 0; i < N; i++)
		{
			for (int j = 0; j < N; j++)
			{
				for (int k = 0; k < N; k++)
				{
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return c;
	}
	
	public static void main(String[] args)
	{
		double[] a = {2, 3.0, 4, 8, 9};
		System.out.println(ArrayMethodsEthan.getMax(a));
		System.out.println(ArrayMethodsEthan.mean(a));
		double[] b = new double[a.length];
		b = ArrayMethodsEthan.copyArray(a);
		ArrayMethodsEthan.arrayPrint(b);
		
		ArrayMethodsEthan.reverseArray(a);
		ArrayMethodsEthan.arrayPrint(a);
	}
	
}





