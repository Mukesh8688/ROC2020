package abstractclasspack;

public abstract class EmployeeAbstract {
	
	private int id;
	private String name;
	
	// Constrcutor
	
	public EmployeeAbstract() {
		
	}
	
	public EmployeeAbstract(int id, String name) {
		this.id = id;
		this.name =name;
	}
	
	
	//getter and setter
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id =id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void display();

}
