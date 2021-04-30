package kodlamaio;

public class Insttructor extends User {
	
	
	String VcourseName;
     int VcourseId;
 
public Insttructor(int VcourseId,String VcourseName,int id, String name, String surname, String email, int password) {
	super(id,name,surname,email,password);
	this.VcourseId=VcourseId;
	this.VcourseName=VcourseName;
}

public int getVcourseId() {
	return VcourseId;
}
public void setVcourseId(int vcourseId) {
	VcourseId = vcourseId;
}
public String getVcourseName() {
	return VcourseName;
}
public void setVcourseName(String vcourseName) {
	VcourseName = vcourseName;
}
}
