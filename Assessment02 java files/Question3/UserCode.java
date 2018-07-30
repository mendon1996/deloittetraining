package com.assessment2.Question3;

public class UserCode {
	
	public static boolean checkTripplets(int[] array) {
 		{
 	 		for(int i=0,length =array.length;i<length;i++)
 	 		{
 	 			if(i==(length-2)) //This indicates that there are just two numbers left to check. This implies that there can be no tripplets and the loop breaks.
 	 			{
 	 				break;
 	 			}	
 	 			if((array[i]==array[i+1])&&(array[i]==array[i+2]))//This checks for consecutive triplets.
 	 			{
 	 				return true;
 	 			}
 	 		}
 	 		return false;
 	 	}
		
	}

 	

}
