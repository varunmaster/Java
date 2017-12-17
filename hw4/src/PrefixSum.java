public class PrefixSum {
    public static void main(String[] args) {
    int[] a = new int[args.length];
    
    for (int i = 0;  i < args.length;  i++) {
        a[i] = Integer.parseInt(args[i]);
    }	
    //System.out.println(a);
    //System.out.println(prefixSum(a));
}
    public static int[] prefixSum(int[] a){
    	int[] s = new int[a.length];
    	
    	for (int i = 1; i <= a.length; i++){
    		int sum = 0;
    		for (int j = 0; j < i; j++){
    			sum += a[j];
    		}
    	s[i-1] = sum;
    	}	
    	return s;
    }
    
    public static int [][] prefixSum (int[][] a ) {
		 int [][] s = new int [a.length][a[0].length];  
		 int [] hSum; 
		 
		 s[0] = prefixSum(a[0]); 
		 
		 for (int i=1; i<a.length; i++) { 
			 hSum = prefixSum(a[i]);
			  for(int j=0; j<a[0].length; j++) { 
			 s[i][j] = s[i-1][j] + hSum[j];
			 } 
			}  
			return s;
		}
	}