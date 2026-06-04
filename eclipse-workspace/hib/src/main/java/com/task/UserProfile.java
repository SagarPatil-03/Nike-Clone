package com.task;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class UserProfile {
	
	@Id
	private int id ;
	private String add;
	private String phn;
	
	@OneToOne()
	@JoinColumn(name="user_id")
	private User users;
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "UserProfile [id=" + id + ", add=" + add + ", phn=" + phn + ", user=" + user + "]";
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getPhn() {
		return phn;
	}
	public void setPhn(String phn) {
		this.phn = phn;
	}
	public User getUser() {
		return users;
	}
	public void setUser(User users) {
		this.users = users;
	}

}
