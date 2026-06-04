package pass;

public class Person {
	
	private String Name;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getMono() {
		return mono;
	}
	public void setMono(String mono) {
		this.mono = mono;
	}
	private String mono;
	@Override
	public String toString() {
		return "Person [Name=" + Name + ", mono=" + mono + "]";
	}

}
