package collectiondemos;

import java.util.Comparator;

public class CustomerAddressComparator implements Comparator<Customer> {
	
	/*@Override
	public int compare(Customer 01, Customer 02) {
		if(o1.getCustomerAddress().compareTo(o2.getCustomerAddress())>0)
		{
			return -1;
		}
		else
		{
			return 1;
		}
	}*/



	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		if(o1.getCustomerAddress().compareTo(o2.getCustomerAddress())>0)
		{
			return -1;
		}
		else
		{
			return 1;
		}
	}
}
