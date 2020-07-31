package DAA;

class MatrixChainMultiplication { 

    public static void main(String args[]) 
	{ 
		int array[] = new int[] { 1, 2, 3, 4, 3 }; 
		int n = array.length; 

		System.out.println("Shreyas Malewar");
        System.out.println("V_B_60");  
		System.out.println("Minimum number of multiplications is "
							+ MatrixChainOrder(array, 1, n - 1)); 
	} 

	static int MatrixChainOrder(int p[], int i, int j) 
	{ 
		if (i == j) 
			return 0; 

        int minimum = Integer.MAX_VALUE; 
        
		for (int k = i; k < j; k++) { 
			int count = MatrixChainOrder(p, i, k) + 
						MatrixChainOrder(p, k + 1, j) + 
						p[i - 1] * p[k] * p[j]; 

			if (count < minimum) 
				minimum = count; 
		} 

		return minimum; 
	} 
} 

