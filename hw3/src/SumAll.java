
public class SumAll {
    public static void main(String[] args) {
    	float x = 0;
    	
   		for(int i = 0; i < args.length; i++){
    			x += Float.parseFloat(args[i]);
    		}
    	System.out.println(x);
    		
   	}
}

