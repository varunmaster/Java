public class Charge {
	private double x0, y0;
	private double q0;
	
	//create (init) new values: constructor
	public Charge(double x0, double y0, double q0){
		this.x0 = x0;
		this.y0 = y0;
		this.q0 = q0;
	}
	
	public double potentialAt(double x, double y){
		double k = 8.99e09;
		double r = Math.sqrt((x-this.x0)*(x-this.x0) + 
							 (y-this.y0) * (y-this.y0));
		return k * this.q0 / r;
	}
	public String toString(){
		return "<Charge of " + this.q0 + "C " + 
			       "at (" + this.x0 + ", " + this.y0 + ")>";
	}
}