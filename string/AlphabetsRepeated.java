package com.yash.string;

public class AlphabetsRepeated {

	public static void main(String[] args) 
	{
		String s = "chetak chafle";
		
		char [] a= s.toCharArray();
		
		for(int i=0; i<a.length; i++)
		{
			int Count=1;
			
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					Count++;
				}
			}
			if(Count > 1)
			{
				System.out.println(a[i]+"- count :- "+Count);
			}
		}
	}
}
