public class Rumors {
	/**
	 * Generates a uniform random integer between 0 and N-1 but
	 * excluding the values me and self.
	 * 
	 * @param N   Range; must be strictly greater than 1 if src == me,
	 *              and strictly greater than 2 if src != me, 
	 *              otherwise behavior is undefined
	 * @param me  First value to exclude; must be between 0 and N-1
	 * @param src Second value to exclude; must be between 0 and N-1, 
	 *              and may be the same as the first.
	 * @return    Uniform random integer between 0 and N-1 excluding me and src.
	 */
	public static int randomPerson(int N, int me, int src) {
		int M = (me == src) ? (N-1) : (N-2);
		int i = Math.min(me, src), j = Math.max(me, src);
		int p = (int)(M*Math.random());
		//System.err.println(M + "(" + me + "," + src + "): " + p);
		
		if (p >= i) {
			++p;
		}
		if (p >= j && src != me) {
			++p;
		}
		return p;
	}
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]); // # of guests
		int T = Integer.parseInt(args[1]); // # of simulation trials
		//int everyone = 0; //when w = N; number of trials where everyone hears the rumor
		//int w;
		//for(int i = 3; i < N; ++i){		
		int totalComplete;
		int total; 
 				
			if (N <= 3){
				totalComplete = 1*T;
				total = N*T; //added
			}
			else{
			totalComplete = 0;
			total = 0; 
			
		for (int trial = 0;  trial < T; ++trial) {
			boolean[] people = new boolean [ N ];
				for(int k = 0; k < people.length; ++k){
				people[k] = false;
				}
				int current = 0; //(int)(people.length*Math.random());
				int previous = current;
				people[current] = true;
				int trialTotal = 1; ++total;	
			
			while(true) {
				//total++;
				int next = randomPerson(people.length, current, previous);
				if(people[next]){
					break;
					//people[next] = true;
				}
				total++;
				trialTotal++;
				people[next] = true;
				previous = current;
				current = next;
				if (trialTotal == N) break;
			}
			if(trialTotal == N){
				totalComplete++;
			}
		}
	}
		System.out.println(((double)totalComplete)/T);
		System.out.println(((double)total) / T);
	}
}