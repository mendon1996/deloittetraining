package question2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class EmplyeeMain {
	
	public static void main(String[] args) {
		
		List<EmplyeeVo> empvo = new ArrayList<EmplyeeVo>();//creating a list of emplyeeVo objects
			
	 	int noE ;
		int empid;
		String empname;
		double annualincome;
		
		Scanner sc = new Scanner(System.in);
	 	
		System.out.println("Enter No. of Employees : ");
		noE= sc.nextInt();
		
		for(int i=1;i<=noE;i++) 
		{
		System.out.println("Enter the employee ID :");
		 empid=sc.nextInt();
		
		System.out.println("Enter the name of the Employee : ");
		empname = sc.next();
		
		System.out.println("Enter Annual Income of Employee :");
		annualincome = sc.nextDouble();
		
		EmplyeeVo e = new EmplyeeVo(empid, empname, annualincome, 0.0);//object which points to emoid,empname and annual income of one employee created
	
		EmplyeeBo.calincomeTax(e);//Calls the method which calculates 
		
		empvo.add(e);
		
		System.out.println("All information of employee "+i+" are entered." );
		}
		System.out.println();
		System.out.println();
		System.out.println("The entered details are ");
		
		for(EmplyeeVo e:empvo)
		{
			System.out.println(e);
		}
		
		
		Collections.sort(empvo,new EmplyeeSort() );
		
		System.out.println();
		System.out.println();
		
		System.out.println("Information sorted in descending order according to income tax is ");
		for(int j=0;j<empvo.size();j++)
		{
			System.out.println(empvo.get(j));
		}
		
		sc.close();
	}
}