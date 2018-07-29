package question2;

public class EmplyeeBo {
	//the method calincomeTax calculates income tax calculates income tax and then adds it to the object e of EmplyeeVo class.
	public static void calincomeTax(EmplyeeVo e)
	{
		double income = e.getAnnualincome();
		
		
		if(income<=250000)
		{
			e.setIncometax(0);//For annual income less than 250000, you needn't pay any income tax
		}
		else if(income>250000 && income<=500000)
		{
			
			e.setIncometax(0.05*income);//For annual income between 250000 and 500000, you pay 5% of your income as tax. 
		}
		else if(income>500000 && income<=1000000)
		{
			e.setIncometax(0.2*income);//For annual income between 500000 and 1000000, you pay 20% of your income as tax. 
			
		}
		else
		{
			e.setIncometax(0.3*income);//For annual income above 1000000 , you pay 30% of your income as tax. 
		}
		
		
	}
}
