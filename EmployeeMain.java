package incomeTax;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EmployeeMain
{
public static void main(String[] args) {
	
	List<EmployeeVo> empvo = new ArrayList<EmployeeVo>();
		

	int noOfEmp ;
	double empid;
	String empName;
	double annualincome;
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter No. of Employees : ");
	noOfEmp= sc.nextInt();
	
	for(int i=1;i<=noOfEmp;i++) 
	{System.out.println("Enter EmpID :");
	 empid=sc.nextDouble();
	
	System.out.println("Enter Employee Name : ");
	empName = sc.next();
	
	System.out.println("Enter Annual Income of :");
	annualincome = sc.nextDouble();
	
	EmployeeVo e = new EmployeeVo(empid, empName, annualincome);
	EmployeeBo empbo = new EmployeeBo();
	empbo.calincomeTax(e);
	empvo.add(e);
	
	}
	
	
	for(EmployeeVo e:empvo)
	{
		System.out.println(e);
	}
	
	
	System.out.println();
	System.out.println();
	System.out.println();
	
	Collections.sort(empvo,new EmployeeSort() );
	
	for(int j=0;j<empvo.size();j++)
	{
		System.out.println(empvo.get(j));
	}
		
	
	
}
}