package cse360assign2;

public class Analytics extends OrderedIntList
{
	OrderedIntList list = new OrderedIntList();
	
	public double mean()
	{
		double result = -1;
		int total = 0;
		
		for(int index = 0; index < array1.length; index ++)
			total = total + array1[index];
		
		result = total / array1.length;
		return result;
	
	}
	
	public int median()
	{
		int result = -1;
		
		return result;
	}
	
	public int high()
	{
		int result = -1;
		
		for(int index = 0; index < array1.length; index ++)
			if(array1[index] > result)
				result = array1[index];
		
		return result;
		
	}
	
	public int low()
	{
		int result = -1;
		
		for(int index = 0; index < array1.length; index ++)
			if(array1[index] < result)
				result = array1[index];
		
		return result;
	}
	
	public int numInts()
	{
		int results = 0;
		
		results = array1.length;
		return results;
		
	}
}