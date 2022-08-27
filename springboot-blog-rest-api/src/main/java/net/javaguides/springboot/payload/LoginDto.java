package net.javaguides.springboot.payload;

import lombok.Data;


public class LoginDto {
	private String usernameOrEmail;
	private String password;
	
	public LoginDto() {
		// TODO Auto-generated constructor stub
	}

	public LoginDto(String usernameOrEmail, String password) {
		super();
		this.usernameOrEmail = usernameOrEmail;
		this.password = password;
	}

	public String getUsernameOrEmail() {
		return usernameOrEmail;
	}

	public void setUsernameOrEmail(String usernameOrEmail) {
		this.usernameOrEmail = usernameOrEmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
