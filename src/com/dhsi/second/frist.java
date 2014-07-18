package com.dhsi.second;

public class frist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] i=new int[5];
		i[3]=9;
		int[] j=new int[]{4,5,6,7,8,9};
		j[2]=2;
		
	float[] f=new float[5];
	f[2] =(float) .02;
	
long[] d= new long[5];
d[3]=669999999;

		for(int k=0;k<i.length;k++)
			System.out.println(i[k]);
		
		
		for(int k=0;k<j.length;k++)
			System.out.println(j[k]);

		for(int k=0;k<f.length;k++)
			System.out.println(f[k]);
		
		for(int k=0;k<d.length;k++)
			System.out.println(d[k]);
		
	}

}
