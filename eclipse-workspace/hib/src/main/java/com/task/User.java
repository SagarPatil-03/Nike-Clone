package com.task;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "users") 
public class User {
	@Id
	private int id ;
	private String username;
	private String email;
	
	@OneToOne(mappedBy="users")
	
	private UserProfile userp;
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", email=" + email + ", userp=" + userp + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public UserProfile getUserp() {
		return userp;
	}
	public void setUserp(UserProfile userp) {
		this.userp = userp;
	}

}
