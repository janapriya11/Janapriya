package Test.Janapriya;

import java.util.Scanner;

public class ScannerConcept 
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String company = "", location = "",employeeName = "", projectName = "";
		Integer employeeCount = 0;
		Double salary = 0.0;
		Boolean preEmployee = false;
		Long companyContact = 0L;
				
		//input section
		
		System.out.println("update company info");
		System.out.println("Enter the company name");
		company = scan.nextLine();
		System.out.println("Enter the company location");
		location = scan.next();
		System.out.println("Enter employee count in the company");
		employeeCount = scan.nextInt();
		System.out.println("Enter employee name");
		employeeName = scan.next();
		System.out.println("Enter the projectName");
		projectName = scan.next();
		System.out.println("Enter salary of the employee");
		salary = scan.nextDouble();
		System.out.println("Is she/he worked previously:");
		preEmployee = scan.nextBoolean();
		System.out.println("Enter Company Contact");
		companyContact = scan.nextLong();
		
		
		//output section
		System.out.println("Company informations are");
		System.out.println("The company name is:" + company);
		System.out.println("The company location is:" + location);
		System.out.println("The employee count in the company is:" + employeeCount);
		System.out.println("The employee name is:" + employeeName);
		System.out.println("The project name is:" + projectName);
		System.out.println("The salary of the employee is:" + salary);
		System.out.println("Employee previous working:" + preEmployee);
		System.out.println("The company contact number is:" + companyContact);
		System.out.println(employeeName+""+"is working in"+company+""+"in"+location+""+"in the project of"+projectName+""+"with package"+salary);
		scan.close();
		
	}
	}


