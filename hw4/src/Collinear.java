
public class Collinear {
    public static boolean collinear (double x1, double y1,
                                     double x2, double y2,
                                     double x3, double y3) {
        return Math.abs((y2-y1)*(x3-x1) - (y3-y1)*(x2-x1)) < 1e-10;
    }
    
    public static boolean collinear (double[][] P) {
        for (int i = 2; i < P.length;  i++) {
            if (!collinear(P[0][0], P[0][1], P[1][0], P[1][1], P[i][0], P[i][1])) {
                return false;
            }
        }
        return true;  // if n <= 2 or no violating points
    }
}
