
public class TimeSeries {
	//Representation: Properties/-ies
	private double[] values;
	
	//init: constructor(s)
	public TimeSeries (int n){
		this.values = new double[n]; //default init: all 0.0
	}
	public TimeSeries (double[] values){
		//Dangerous: we arent (necessarily) sole "owners" of out "values"
		//this.values = values;
		
		//create our own private copy instead
		//then, we implement methods, we will make sure that the "this.values reference never "escapes"
		this.values = new double[values.length];
		for (int i = 0; i < values.length; i++){
			this.values[i] = values[i];
		}
	}
	
	public String toString(){
		String s = "[ ";
		for (int i =0; i < values.length; i++){
			s +=this.values[i];
			if(i < values.length - 1){
				s+= ", ";
			}
		}
		return s;
	}
	
	public double mean(){
		double sum = 0.0;
		for (int i = 0; i < values.length; i++){
			sum += this.values[i];
		}
		return sum / this.values.length;
	}
	public double stddev(){
		double sumSqDiff = 0.0; 
		for(int i = 0; i < this.values.length; i++){
			double diff = this.values[i] - this.mean();
			sumSqDiff += diff*diff;
		}
		return Math.sqrt(sumSqDiff/this.values.length);
	}
	
	public TimeSeries scale (double c){
		int N = this.values.length;
		double[] scaledValues = new double [N];
		for (int i = 0; i < N; i++){
			scaledValues[i] = c*this.values[i];
		}
		return new TimeSeries(scaledValues);
	}
/*	public TimeSeries add (TimeSeries other){
		int N = this.values.length;
		double[] sumOfValues = new double[N];
	}*/
}
