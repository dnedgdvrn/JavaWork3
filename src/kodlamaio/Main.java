package kodlamaio;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 StudentUser studentUser = new StudentUser(0, "Java", 1, "Döne", "Dağdeviren", "dnedgdvrn2", 123);
		 
		Insttructor insttructor =new Insttructor(1, "java", 2, "Engin", "Demiroğ", "engindemir@com", 456);
		UserManager userManager =  new UserManager();
		userManager.logIn(studentUser);
		userManager.logIn(insttructor);
		StudentManager studentManager = new StudentManager();
		studentManager.Add(studentUser);
		InsttructorManager insttructorManager= new InsttructorManager();
		insttructorManager.Add(insttructor);
		
		
				 
				 
				 
				 
				

	}

}
