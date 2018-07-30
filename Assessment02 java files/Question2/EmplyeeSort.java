package com.assessment2.Question2;

import java.util.Comparator;

public class EmplyeeSort implements Comparator<EmplyeeVo> {
	
	@Override
	public int compare(EmplyeeVo o1, EmplyeeVo o2) {
		if(o1.getIncometax()>(o2.getIncometax()))
		{
			return -1;  //This would enable us to arrange the input values in the decreasing order. If the return value was 1, it would arrange the list in the ascending order.
		}
		else
		{
			return 1; 
		}

	}
}
	

