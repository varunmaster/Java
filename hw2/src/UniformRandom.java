public class UniformRandom {
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		double [] Random = new double [N];
		double avg = 0;
		double sum = 0;
		double min = 2;
		double max = Random[0];
		
		for(int i = 0; i < Random.length; i++){
			double rnd = (double)(Math.random());
			Random[i] = rnd;
			sum = sum + Random[i];
			avg = (double) (sum/Random.length);
		}
		for(int j = 0; j < Random.length; j++){
			if(Random[j] < min)
				min = Random[j];
		}
		for(int k = 0; k < Random.length; k++){
			if(Random[k] > max)
				max = Random[k];
		}
		System.out.println(avg);
		System.out.println(min);
		System.out.println(max);
	}
} 