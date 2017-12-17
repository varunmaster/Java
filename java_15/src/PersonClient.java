
public class PersonClient {
	
	public static void main(String[]args){
		Person obama = new Person("Barack", "Obama", 1961);
		Person putin = new Person("Vladimir", "Putin", 1952);
		Person bieber = new Person("Justin", "Bieber", 1994);
		
		Person[]celebrities = {
				obama, putin, bieber
	    };
		//this also works, since "new Person(...)" is just a person value
		/*Person [] celeb = {
				new Person("Barack", "Obama", 1961),
				new Person("Vladimir", "Putin", 1952),
				new Person("Justin", "Bieber", 1994)
		};*/
	
		
		//for(int i = 0; i < celebrities.length; i++){
			//Person p = celebrities[i];
			//System.out.println(p.getFullName() + " is " + p.getAge() + " years old");
		//}
		
		
		for (Person p : celebrities){
			System.out.println(p.getFName());
			System.out.println(p.getFullName() + " is " + p.getAge() + " years old");
		}
	
		//System.out.println(obama.getFullName() + " is " + obama.getAge() + " years old");
	}
}

