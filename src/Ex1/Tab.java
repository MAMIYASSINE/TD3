package Ex1;

import java.util.Scanner;

public class Tab {
	private static int NVMAX=40;
	static void remplir(float t[])
	{
		for(int i=0; i <t.length;i++)
		{
			Scanner sc= new Scanner(System.in);
			float F=sc.nextFloat();
			t[i]=F;
		
		}
	}
	static float somme_element (float t[])
	{
		float S=0;
		for(int i=0;i<t.length;i++ )
		{
			S=S+t[i];
		}
		return S ;
	}
	static float[] additionner (float t1[] , float t2[])
	{
		int i=0,j=0;
		if(t1.length<t2.length)
		{
			float t[]=new float[t2.length];
			for(i=0;i<t2.length;i++)
			{
				t[i]=t2[i];
			}
			for(j=0;j<t1.length;j++)
			{
				t[j]=t[j]+t1[j];
			}
			return t;
		}
		else
		{
			float t[]=new float [t1.length];
			for(i=0;i<t1.length;i++)
			{
				t[i]=t1[i];
			}
			for(j=0;j<t2.length;j++)
			{
				t[j]=t[j]+t2[j];
			}
			return t;
		}
	}
	static float[] produit(float x,float t[])
	{
		float tr[]=new float[t.length];
		for(int i=0;i<t.length;i++)
		{
			tr[i]= t[i]*x;
		}
		return tr;
	}
	static void lister(float t[])
	{
		for(int i=0;i<t.length;i++)
		{
			System.out.println(t[i]);
		}
	}
	public static int getNVMax() {
		return NVMAX;
	}
	public static void setNVMax(int nVMax) {
		NVMAX = nVMax;
	}
	static float[] additioner(float x, float t[])
	{
		for(int i=0;i<t.length;i++)
		{
			t[i]=t[i]+x;
		}
		return t;
	}
	
}

