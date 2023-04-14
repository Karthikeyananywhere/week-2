package exception;

public class Intern {

	
	private String name;
	
	private String password;
	
	private String email;
	
	private Long phoneNumber;

	
	
	public Intern() {
		super();
	}

	
	public Intern(String name, String password, String email, Long phoneNumber) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Intern [name=" + name + ", password=" + password + ", email=" + email + ", phoneNumber=" + phoneNumber
				+ "]";
	}
	
	
}
