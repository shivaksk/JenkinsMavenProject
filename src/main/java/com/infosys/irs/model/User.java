package com.infosys.irs.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class User {
	@NotBlank(message = "UserId cant be null")
	@Size(min = 3, max = 15, message = "User Id Must between 3 to 15")
	private String userId;
	
	@NotBlank(message = "password cant be null")
	@Size(min = 3, max = 15, message = "User Id Must between 3 to 15")
	private String password;

	@NotBlank(message = "Name cant be null")
	@Size(min = 3, max = 15, message = "User Id Must between 3 to 15")
	private String name;
	
	@NotBlank(message = "City cant be null")
	private String city;
	
	@NotBlank(message = "email cant be null")
	@Email
	private String email;
	
	@NotBlank(message = "email cant be null")
	@Size(min = 10, max = 10, message = "Phone number must be 10 digits")
	private String phone;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + ", name=" + name + ", city=" + city + ", email="
				+ email + ", phone=" + phone + "]";
	}

}
