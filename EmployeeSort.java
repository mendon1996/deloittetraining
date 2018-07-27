package incomeTax;

import java.util.Comparator;

public class EmployeeSort implements Comparator<EmployeeVo> {
	@Override
	public int compare(EmployeeVo o1, EmployeeVo o2) {
		if(o1.getIncometax()>(o2.getIncometax()))// TODO Auto-generated method stub
		{
			return -1;  //if -1 it will be in descending order
		}
		else
		{
			return 1; 
		}
}

	
	
	
}

