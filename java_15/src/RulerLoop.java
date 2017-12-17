
public class RulerLoop {

	public static void main(String[] args) {
		int depth = Integer.parseInt(args[0]);
		
		String ruler = "1";
		int level = 1;
		//'ruler' holds subdivisions for depth equal to 'level'
		while (level < depth){
			//'ruler' holds subdivisions for depth equal to 'level'
			ruler = ruler + " " + (level + 1)+ " " + ruler;
			level = level + 1;
		}
		//'ruler' holds subdivisions for depth equal to 'level'
		//AND level == depth (because loop termination condition is level < depth)
		System.out.println(ruler);

	}

}
