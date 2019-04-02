import java.io.*;
import java.util.*;

class distance
{
	public static void main(String args[])
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size of data");
	    int n=sc.nextInt();
	    int a[]=new int[n],b[]=new int[n];
        int i;
        System.out.println("Enter the data 1");
	    for(i=0;i<n;i++)
	    {
	        a[i]=sc.nextInt();
	    }
	    System.out.println("Enter the data 2");	
	    for(i=0;i<n;i++)
	    {
	        b[i]=sc.nextInt();
	    }   
	    System.out.println("Enter the Choice 1. ED\n2. MD\n3. Mi.D\n4.SD\n0.Exit");
	    int ch=sc.nextInt();
	    while(ch!=0)
	    {
	      switch(ch)
	      {
	        case 1:
	        {
	            System.out.println(ED(n,a,b));   
	            break;
	        }
	        case 2:
	        {
	            System.out.println(MD(n,a,b));   
	            break;
	        }
	        case 3:
	        {
	            System.out.println(MiD(n,a,b));   
	            break;
	        }
	        case 4:
	        {
	            System.out.println(SD(n,a,b));   
	            break;
	        }
	        default:
	        {
	            System.out.println("Incorrect input");   
	        }
	      }
	      ch=sc.nextInt();    
	    }
	}
	static double ED(int n,int a[],int b[])
	{
        double sum=0;
	    double d;
	    for(int i=0;i<n;i++)
	    {
	        sum=sum+Math.pow((a[i]-b[i]),2);
	    }
	    d=Math.sqrt(sum);
	    return d;
	}
	
	static double MD(int n,int a[],int b[])
	{
	    double sum=0;
	    for(int i=0;i<n;i++)
	    {
	        sum=sum+Math.abs(a[i]-b[i]);
	    }
	    return sum;
	}
	
	static double MiD(int n,int a[],int b[])
	{
	    Scanner sc=new Scanner(System.in);
	    double sum=0;
	    double d;
	    System.out.println("Enter the value of b");
	    double B=sc.nextDouble();
	    for(int i=0;i<n;i++)
	    {
	        sum=sum+Math.pow(Math.abs(a[i]-b[i]),B);
	    }
	    d=Math.pow(sum,1/B);
	    return d;
	}
	
	static double SD(int n,int a[],int b[])
	{
	    int max=0;
	    for(int i=0;i<n;i++)
	    {
	        if(max<=Math.abs(a[i]-b[i]))
	        max=Math.abs(a[i]-b[i]);
	    }
	    return max;
	} 
}
