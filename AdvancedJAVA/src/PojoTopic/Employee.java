package PojoTopic;

public class Employee {
	int empi_id;
	String emp_name;
	double emp_sal;

	public Employee(int empi_id, String emp_name, double emp_sal) {
		super();
		this.empi_id = empi_id;
		this.emp_name = emp_name;
		this.emp_sal = emp_sal;
	}

	public int getEmpi_id() {
		return empi_id;
	}

	public void setEmpi_id(int empi_id) {
		this.empi_id = empi_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public double getEmp_sal() {
		return emp_sal;
	}

	public void setEmp_sal(double emp_sal) {
		this.emp_sal = emp_sal;
	}

	@Override
	public String toString() {
		return "Employee [empi_id=" + empi_id + ", emp_name=" + emp_name + ", emp_sal=" + emp_sal + "]";
	}

}
