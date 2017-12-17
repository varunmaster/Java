
public class CounterClient {

	public static void main(String[] args) {
		Counter c = new Counter();
		
		System.out.println(c.getValue());
		c.increment();
		System.out.println(c.getValue());
		
		Counter c2 = c;
		
		c2.increment(5);
		System.out.println(c.getValue());
		System.out.println(c2.getValue());
			// both c and c2 point to the same Value. they are aliases for the same Value of 6
	}

}
