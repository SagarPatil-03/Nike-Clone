package OneToone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="car_info")
public class Car {
	
	@Id
	private int id;
	@Override
	public String toString() {
		return "Car [id=" + id + ", brand=" + brand + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	private String brand;
	
	
	
	
	

}
