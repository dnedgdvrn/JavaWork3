package kodlamaio;

public class StudentUser extends User {
int	AcoursId;
String AcoursName;

public StudentUser(int AcoursId,String AcoursName,int id, String name, String surname, String email, int password) {
	
	super(id,name,surname,email,password);
	this.AcoursId=AcoursId;
	this.AcoursName=AcoursName;
}


public int getAcoursId() {
	return AcoursId;
}
public void setAcoursId(int acoursId) {
	AcoursId = acoursId;
}
public String getAcoursName() {
	return AcoursName;
}
public void setAcoursName(String acoursName) {
	AcoursName = acoursName;
}



}
