package demo.managedbeans;

public class AcmeManagedBean {
	private String location;
	private String name;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String clear(){
		this.setName(null);
		this.setLocation(null);
		return "clear";
	}

	public String submit() {
		return "submit";
	}
}
