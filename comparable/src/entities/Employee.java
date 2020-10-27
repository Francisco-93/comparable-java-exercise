package entities;

public class Employee implements Comparable<Employee>{
	
	private String name;
	private Double salary;
	
	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee other) {
		
		if(salary < other.getSalary()) {
			return 1;
		}
		if(salary > other.getSalary()) {
			return -1;
		}
		return 0;
		
		//return name.compareTo(other.getName());  ----------> MAIS FÁCIL
	}
	
}
