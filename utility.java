package com.function.utilities;
import java.util.Scanner;

public class utility
{

	
		static Scanner s = new Scanner(System.in);
		public static int getInt()
		{
			int i =s.nextInt();
			return i;
		}
		public static double getDouble()
		{
			double j =s.nextDouble();
			return j;
		}
		public static float getFloat()
		{
			float k=s.nextFloat();
			return k;
		}
		public static String getString()
		{
			String l=s.next();
			return l;
		}
		public static void bubblesort()
		{ 
			System.out.println("enter arr size");
			int arrsize= s.nextInt();
			int a[]= new int[arrsize];
			System.out.println("enter arr elements");
			for(int k =0;k<=arrsize-1;k++)
			{
				a[k]=s.nextInt();
			}
			int temp=0;
			for(int c=1;c<=a.length-1;c++)
			{
				for(int i=0;i<=a.length-2;i++)
				{
					if(a[i]>a[i+1])
					{
						temp=a[i];
						a[i]=a[i+1];
						a[i+1]=temp;
					}
				}
			}
			for(int j =0;j<=a.length-1;j++)
			{
				System.out.print(a[j]+" ");
			}
		}
		public static void gamblerstake()
		{
			System.out.println("enter stake");
			int stake =s.nextInt();
			System.out.println("enter goal");
			int goal=s.nextInt();
			System.out.println("enter number of try");
			int number=s.nextInt();
			int win=0;
			int loss =0;
			for(int i=0;i<=number;i++)
			{
				double d=Math.random();
				while(stake!=goal && stake!=0)
				{
				    if(d<0.5)
				    {
					    stake++;
					    win++;
				    }
				    else
				    {
				    	stake--;
				    	loss++;
				    }
				}
				
			}
			System.out.println("no. of win = " + win);
			System.out.println("win percentage is "+ (win/(win + loss))*100);
			System.out.println("loss percentage is "+ (loss/(win + loss))*100);
		}
		public static void insertionSort()
		{
			System.out.println("enter arr size");
			int arrsize=s.nextInt();
			int[] a =new int[arrsize];
			System.out.println("enter arr elements");
			for(int i=0;i<arrsize;i++)
			{
				a[i]=s.nextInt();
			}
			int temp;
			int k;
			for(int j=1;j<arrsize;j++)
			{
				temp=a[j];
				k=j;
				while(k>0 && a[k-1]>temp)
				{
					a[k]=a[k-1];
					k-=1;
				}
				a[k]=temp;
			}
			for(int i =0;i<a.length;i++)
			{
				System.out.println(a[i]);
			}
		}
		public static void anagram1()
		{
			Scanner s = new Scanner(System.in);
			int temp= 0;
			System.out.println("enter first string");
			String s1= s.next();
			System.out.println("enter second string");
			String s2=s.next();
			String s3 = s1.toUpperCase();
			String s4 = s2.toUpperCase();
			if(s1.length()==s2.length())
			{
				for(int i= 0;i<=s3.length()-1;i++)
				{
					for(int j=0;j<=s4.length()-1;j++)
					{
						if(s3.charAt(i)==s4.charAt(j))
						{
							temp++;
							break;
						}
					}
				}
				if(temp==s1.length())
				{
					System.out.println(s1+" is a anagram of " + s2);
				}
				else
				{
					System.out.println(s1 +" is not a anagram of" + s2);
				}
			}
			else
			{
				System.out.println(s1+" is not a anagram of"+ s2);
			}
		}


	

}
