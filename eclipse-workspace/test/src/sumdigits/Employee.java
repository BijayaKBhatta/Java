package sumdigits;

public class Employee {

	   private String name;
	    private int empId;
	    private long salary;

	    public String getName() {
	        return name;
	    }

	    public int getEmpId() {
	        return empId;
	    }

	    public long getSalary() {
	        return salary;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setEmpId(int empId) {
	        this.empId = empId;
	    }

	    public void setSalary(long salary) {
	        this.salary = salary;
	    }

	    public Employee(String name, int empId, long salary) {
	        this.name = name;
	        this.empId = empId;
	        this.salary = salary;
	    }
	    @Override
	    public int hashCode() {
	        return 1;
	    }
	  /*  @Override
	    public boolean equals(Object obj) {
	    	Employee e = (Employee)obj;
	    	if(this.name.equals(e.name)) return true;
	    	return false;
	    }
	    */
}
