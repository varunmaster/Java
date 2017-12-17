
public class Sorted {

	public static void main(String[] args) {
		int [] sorted = new int [(args.length)];
		String order = "";
		boolean Ascending = true;
		boolean Descending = true;

		for(int i = 0; i < args.length; i++){
			sorted [i] = Integer.parseInt(args[i]);
		}
		if((args.length == 0) || (args.length == 1)){
			order = "Ascending";
		}
		for (int i =1; i < args.length; i++){
			if(sorted[i-1] > sorted [i]){
				Ascending = false;
			}
				else if(sorted[i-1] < sorted[i]){
					Descending = false;
				}
				else if((sorted[i-1] > sorted[i]) && (sorted[i] < sorted[i+1])){
					order = "Unsorted";
				}			
		}
		if (Ascending == false){
			order = "Descending";	
		}
		if (Descending == false){
			order = "Ascending";
		}
		if ((Descending == false)&&(Ascending == false)){
			order = "Unsorted";
		}
		if (Ascending == true){
			order = "Ascending";
		}
		System.out.println(order);
		
	}
}
