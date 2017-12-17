
public class TimeSeriesClient {
public static void main(String[] args){	
	TimeSeries zero = new TimeSeries(10);
	System.out.println(zero);
	
	double []someValues = {1, 2, 3};
	TimeSeries s = new TimeSeries(someValues);
	System.out.println(s);
	
	someValues[1] = 20;
	System.out.println(s);
	System.out.println(s.mean());
	System.out.println(s.stddev());
}
}
