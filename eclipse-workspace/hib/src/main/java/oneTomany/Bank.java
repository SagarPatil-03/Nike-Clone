package oneTomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="bank_info")
public class Bank {
	
	
	@Override
	public String toString() {
		final int maxLen = 10;
		return "Bank [id=" + id + ", name=" + name + ", loc=" + loc + ", pin=" + pin + ", customer="
				+ (customer != null ? customer.subList(0, Math.min(customer.size(), maxLen)) : null) + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	@Id
	private int id ;
	private String name ;
	private String loc;
	private String pin;
	@OneToMany
	private List<Customer> customer;
	public List<Customer> getCustomer() {
		return customer;
	}
	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}

}
