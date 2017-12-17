
public class Counter {
	private int value;
	
	public Counter(){
		this.value = 0;
	}
	
	public void increment(int delta){
		if (delta >= 0){ //we dont want to allow decrementing
			this.value += delta;
		}
	}
	
	public void increment(){
		//++this.value; // better but not by much since this example is easy
		this.increment(1);
	}
	
	public int getValue(){
		return this.value;
	}
}
