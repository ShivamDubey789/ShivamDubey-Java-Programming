package sept6.practiceAndalsoQuestions.lab3;



public class HillStation {

	//method location created for hillstations 
	public void location() {
		
		System.out.println("Hillstations ");
	}
	
	//method famous created for hillstations 
	public void famousFor() {
		System.out.println("famous for beautifull scenery and mountains");
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		//Hillstations object created and its methods are called
		HillStation hill = new HillStation();
		
		
		hill.location();
		hill.famousFor();
		
	
		System.out.println("");
		
		
		//Hillstation object created with subclass's /child class  to override and its methods are called
		HillStation man = new Manali();
		
	
		man.location();
		man.famousFor();
		
		System.out.println("");
		
		
		HillStation mus = new Mussoorie();
		
		mus.location();
		mus.famousFor();
		
		System.out.println("");
		
		
		HillStation gul = new Gulmarg();
		gul.location();
		gul.famousFor();
		
		System.out.println("");
	}
}

