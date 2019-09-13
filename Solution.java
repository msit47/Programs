package way;

import java.util.HashMap; 
import java.util.Map; 

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] Counts= {"900,music.google.com"
				,"100,yahoo.com"
				,"200,karat.com"};
     countclicks(Counts);
     
	}
	public static void countclicks(String[] Counting)
	{
		HashMap<String,Integer> hm=new HashMap<>();
		for(int i=0;i<Counting.length;i++)
		{
			String str=Counting[i];
			String[] p=str.split(",");
			
			hm.put(p[1],Integer.parseInt(p[0]));
			while(p[1].contains("."))
			{
				String str2=p[1];
				String[] a=str2.split("\\.",2);
				//System.out.println(a[0]+" "+a[1]);
				//break;
				if(hm.containsKey(a[1]))
				{
				int valuepresent=hm.get(a[1]);
				//	System.out.println(valuepresent);
				valuepresent = valuepresent + Integer.parseInt(p[0]);
					hm.put(a[1],valuepresent);
				}
				if(!hm.containsKey(a[1]))
				{
				hm.put(a[1],Integer.parseInt(p[0]));
				}
				p[1]=a[1];
			/*	if(hm.containsKey("a[2]"))
				{
					hm.put(a[2],Integer.parseInt(p[0]));
				}*/
					
			}
			
		}
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getValue()+" "+m.getKey());
		}
	}

}
