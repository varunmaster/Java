//import java.util.Scanner;

public class Equals {

	public static boolean eq(int[] x, int[] y){
		int count = 0;
		if(x.length == y.length){
			boolean[] equals = new boolean[x.length];
			for (int i = 0; i < x.length; i++){
				if (x[i] == y[i]){
					equals[i] = true;
				}
			}
			for (int j = 0; j < x.length; j++){
				if (equals[j]){
					count++;
				}
			}
			if (count == x.length){
				return true;
			}
			return false;
		}
		else {
			return false;
		}
	}
    	
}
