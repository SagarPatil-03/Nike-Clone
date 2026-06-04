package OneToone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="eng_info")
public class Engine {
	
	@Id
	private Integer id;
	private String mileage;
	private String cc;
	
	@OneToOne
	private Engine engine;

	@Override
	public String toString() {
		return "Engine [id=" + id + ", mileage=" + mileage + ", cc=" + cc + ", engine=" + engine + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMileage() {
		return mileage;
	}

	public void setMileage(String mileage) {
		this.mileage = mileage;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

}
