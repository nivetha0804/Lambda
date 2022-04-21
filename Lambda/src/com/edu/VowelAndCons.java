package com.edu;

public class VowelAndCons 
{
	public static void main(String[] args) 
	{
		String s="iam a edubridge learner";
		int vcount=0;
		int ccount=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='a' || ch=='e'|| ch=='i' ||ch=='o' ||ch=='u')
			{
				vcount++;
			}
			else 
			{
				ccount++;
			}
		}
		System.out.println("=====IAM A EDUBRIDGE LEARNER=====");
		System.out.println("Enter the Total Vowels= "+vcount);
		System.out.println("Enter the Consonent Count= "+ccount);
	}
}

