
public class CardValidate {
	public static void main(String[] args) {
		long cc = Long.parseLong(args[0]);  // credit card #
		long x = 0;
		long y = 0;
		long j = 0;
		long k = 0;
		
		for(int i=1000; i < 10e13; i= i*100){ //for loop gets every second digit then doubles it
			 x = ((cc%i)/(i/10));			// gets the second digit from right hand side
			 x = x*2;						//doubles the digits 
			if(x >= 10){					//if the double is greater than 10
				j =(x%10);					//breaks up the doubled digit into indiv. n#
				k=(x%100)/10;				
				x = j+k;					//adds the two numbers
				}
		}
			//System.out.println(cc);
		for(int z=10; z< cc; z= z*10){ //for loop to add each number
			 y = (cc%z); 				//get indiv number from cc
			y+=y;						//add each number
		}
			//System.out.println(cc);	
		
	}
}
