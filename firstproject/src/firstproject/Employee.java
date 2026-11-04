package firstproject;

public class Employee {
	
	static String companyName;
	
	int empId;
	String empName;
	String eDepartment;
    int eSalary;

	public static void main(String[] args) {
		System.out.println("main method started");
		
		companyName="TCC";
		
		Employee emp = new Employee();
		
		emp.empName =" harshitha";
		emp.empId=101;
		emp.eDepartment="data searching";
		emp.eSalary=20000;
		
		System.out.println("companyName : "+companyName);
		
		System.out.println("empName :"+emp.empName);
		System.out.println("empId : "+emp.empId);
		System.out.println("eDepartment : "+emp.eDepartment);
		System.out.println("eSalary : "+emp.eSalary);
		
		Employee emp1 = new Employee();
		
		emp.empName =" Ramu";
		emp.empId=102;
		emp.eDepartment="DSA";
		emp.eSalary=30000;
		
		System.out.println("companyName : "+companyName);
		
		System.out.println("empName :"+emp.empName);
		System.out.println("empId : "+emp.empId);
		System.out.println("eDepartment : "+emp.eDepartment);
		System.out.println("eSalary : "+emp.eSalary);
		
		Employee emp2 = new Employee();
		
		emp.empName ="meghu";
		emp.empId=103;
		emp.eDepartment="SQL";
		emp.eSalary=30000;
		System.out.println("companyName : "+companyName);
		
		System.out.println("empName :"+emp.empName);
		System.out.println("empId : "+emp.empId);
		System.out.println("eDepartment : "+emp.eDepartment);
		System.out.println("eSalary : "+emp.eSalary);
		
		
		
		System.out.println("main method started");
		

	}

}
