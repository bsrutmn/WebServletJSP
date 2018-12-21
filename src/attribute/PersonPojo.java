package attribute;

public class PersonPojo {
	String name;
	String surname;
	int id;
	String phoneNumber;
	int age;
	public PersonPojo(int id,String name, String surname, String phoneNumber, int age) {
		super();
		this.name = name;
		this.surname = surname;
		this.id = id;
		this.phoneNumber = phoneNumber;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	

}
