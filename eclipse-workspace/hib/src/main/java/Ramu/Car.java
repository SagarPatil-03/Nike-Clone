package Ramu;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="Car_info")
public class Car {
	@Id
private int id ;
@OneToOne
private Engine E;
@Override
public String toString() {
	return "Car [id=" + id + ", E=" + E + ", brand=" + brand + "]";
}
public Engine getE() {
	return E;
}
public void setE(Engine e) {
	E = e;
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
