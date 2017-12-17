public class BoolVector {
	public static boolean all(boolean[] array){
		int count = 0;
		for (int i = 0; i < array.length; i++){
			if (array[i]){
				count++;
			}
		}
		if (count == array.length)
			return true;
		else
			return false;
	}
	
	public static boolean some(boolean[] array){
		boolean oneIsTrue = false;
		for (int i = 0; i < array.length; i++){
			if (array[i]){
				oneIsTrue = true;
				break;
			}
		}
		if (oneIsTrue)
			return true;
		else
			return false;
	}
	
	public static boolean[] neg(boolean[] array){
		boolean[] newArray = new boolean[array.length];
		for (int i = 0; i < array.length; i++){
			if (array[i])
				newArray[i] = false;
			else
				newArray[i] = true;
		}
		return newArray;
	}
	
	public static boolean[] and(boolean[] a1, boolean[] a2){
		if (a1.length == a2.length){
			boolean[] newArray = new boolean[a1.length];
			for (int i = 0; i < a1.length; i++){
				if (a1[i] && a2[i])
					newArray[i] = true;
			}
			return newArray;
		} else
			return null;
	}
	
	public static boolean[] or(boolean[] a1, boolean[] a2){
		if (a1.length == a2.length){
			boolean[] newArray = new boolean[a1.length];
			for (int i = 0; i < a1.length; i++){
				if (a1[i] || a2[i])
					newArray[i] = true;
			}
			return newArray;
		} else
			return null;
	}
	
	public static boolean[] xor(boolean[] a1, boolean[] a2){
		if (a1.length == a2.length){
			boolean[] newArray = new boolean[a1.length];
			for (int i = 0; i < a1.length; i++){
				if (a1[i] ^ a2[i])
					newArray[i] = true;
			}
			return newArray;
		} else
			return null;
	}
}