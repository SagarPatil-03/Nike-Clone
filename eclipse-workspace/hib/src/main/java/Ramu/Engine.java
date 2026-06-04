package Ramu;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Engine_info")
public class Engine {
	@Id
	private int id ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCc() {
		return cc;
	}
	public void setCc(String cc) {
		this.cc = cc;
	}
	public String getMilege() {
		return milege;
	}
	public void setMilege(String milege) {
		this.milege = milege;
	}
	private String cc;
	private String milege;
	@Override
	public String toString() {
		return "Engine [id=" + id + ", cc=" + cc + ", milege=" + milege + "]";
	}

}
