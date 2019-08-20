
public class Employee {
	    
	    int eno;
	    String ename;
	    double salary;
	    
	    public void inputEmployeeData(int empno, String empname, double empsalary)
	    {
	        eno=empno;
	        ename=empname;
	        salary=empsalary;
	    }
	    public void displayEmployeeData()
	    {
	        System.out.println("Employee number :"+eno);
	        System.out.println("Employee name :"+ename);
	        System.out.println("Employee Salary:"+salary);
	        System.out.println("----------------------------");
	        
	    }
	    public static void main(String[] arg) {
	       Employee employee_Object1 = new Employee();
	       employee_Object1.inputEmployeeData(26, "Pepsi", 500000.00);
	       employee_Object1.displayEmployeeData();
	       
	       Employee employee_Object2 = new Employee();
	       employee_Object2.inputEmployeeData(36, "prashanth Reddy Kodakandla", 1000000.00);
	       employee_Object2.displayEmployeeData();
	       
	       
	    }
	     }
	

	


