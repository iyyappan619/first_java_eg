package MatrixType;


public class Matrix {
	public static void main(String[] args) throws java.lang.Exception {
		printPattern(3);
		//System.out.println("--------------");
		/*printPattern(4);
		System.out.println("--------------");
		printPattern(5);
		System.out.println("--------------");
		printPattern(6);
		System.out.println("--------------");*/
	}
	public static void printPattern(int i) {
		int num = i * i;
		int n = 1;
		int[][] matrixArray = new int[i][i];
		
		for (int g = 0; g < i; g++) 
		{
			for (int j = 0; j < i && n <= num; j++, n++) 
			{
				if (g % 2 == 1) 
				{
					matrixArray[i - (g + 1) / 2][j] = n;
				} 
				else 
				{
					matrixArray[g / 2][j] = n;
				}
			}
		}

		for (int g = 0; g < i; g++) {
			for (int j = 0; j < i; j++) {
				System.out.print(matrixArray[g][j] + " ");
			}
			System.out.println();
		}
	}

}