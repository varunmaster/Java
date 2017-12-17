public class LongestPlateau {
    public static void main(String[] args) {
        int N = args.length;
        int[] a = new int[N];
        
        for (int i = 0;  i < N;  i++) {
            a[i] = Integer.parseInt(args[i]);
        }
        
        int plateau_start = -1;
        int plateau_length = 0;
        int run_start = 0;
        int run_length = 1;
        int value = a[0];
        for (int i = 1;  i < N; i++) {
            if (a[i] == value) {
                ++run_length;
            } else {
                // Current run ended, check if it is a plateau
                if ((run_start == 0 || a[run_start-1] < value) &&
                    (a[i-1] > a[i])) {
                    // Run is a plateau, is it also longer (strictly, due to tiebreak requirement)?
                    if (run_length > plateau_length) {
                        plateau_start = run_start;
                        plateau_length = run_length;
                    }
                }
                // Start new run
                run_start = i;
                run_length = 1;
                value = a[i];
            }
        }
        // Check final run
        if (run_start == 0 || a[run_start-1] < value) {
            if (run_length > plateau_length) {
                plateau_start = run_start;
                plateau_length = run_length;
            }
        }
        
        System.out.println(plateau_start + " " + plateau_length);
    }
}