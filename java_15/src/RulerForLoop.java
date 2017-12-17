
public class RulerForLoop {

	public static void main(String[] args) {
		int depth = Integer.parseInt(args[0]);
		
		String ruler = "1";
		
		for (int level = 1; level < depth; level++){
			ruler = ruler + " " + (level + 1)+ " " + ruler;
		}
	
		System.out.println(ruler);

	}

}
