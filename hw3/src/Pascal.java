public class Pascal {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int[] lastRow;
		int[] currentRow = {1};
	    
		printArray(currentRow);
	    lastRow = currentRow;
	       for (int i = 2; i <= n; i++) {
	           currentRow = new int[i];
	           currentRow[0] = 1;
	           currentRow[i - 1] = 1;
	           for (int j = 0; j <= i - 3; j++) {
	               currentRow[j + 1] = lastRow[j] + lastRow[j + 1];
	           }
	           printArray(currentRow);
	           lastRow = currentRow;
	       }
	   }

	   public static void printArray(int[] array) {
	       for (int k = 0; k < array.length; k++) {
	           System.out.print(array[k] + " ");
	       }
	   }
}