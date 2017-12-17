public class Pythagorean {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int Asquare;
		int Bsquare;
		int Csquare;
		int AB;
		int AC;
		int BC;
		
		Asquare = a * a; 
		Bsquare = b * b;
		Csquare = c * c;
		AB = Asquare + Bsquare;
		AC = Asquare + Csquare; 
		BC = Bsquare + Csquare;
		
		if (AB == Csquare){
			System.out.println("True");
		}else if (AC == Bsquare){
			System.out.println("True");
		}else if (BC == Asquare){
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}
}
