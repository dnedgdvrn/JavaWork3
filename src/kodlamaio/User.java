package kodlamaio;

public class User {
	
	int Id;
	String Name;
	String Surname;
	String Email;
	int Password;
	
	
	public User(int id, String name, String surname, String email, int password) {
		super();
		Id = id;
		Name = name;
		Surname = surname;
		Email = email;
		Password = password;
	}

	
	
	
public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSurname() {
		return Surname;
	}
	public void setSurname(String surname) {
		Surname = surname;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getPassword() {
		return Password;
	}
	public void setPassword(int password) {
		Password = password;
	}





	}


