package incomeTax;

public class EmployeeBo {
public void calincomeTax (EmployeeVo e)
{
	
 if(e.annualincome<250000)
	 e.setIncometax(0);
 else if(e.annualincome>=250001 && e.annualincome<= 500000)
 	{
	  
	 e.setIncometax(0.05*e.annualincome);
 	}
 else if(e.annualincome>=500001 && e.annualincome<=1000000)
 {
	 e.setIncometax(0.2*e.annualincome);
 }
 
 else if(e.annualincome>1000000)
	 e.setIncometax(0.3*e.annualincome);

}

}
