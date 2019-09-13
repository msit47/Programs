package way;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Buddystrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="aabc";
		String str2="aacb";
		boolean buddy=buddyStrings(str1,str2);
		if(buddy==true)
		{
			System.out.println("Buddy Strings");
		}
		else
		{
			System.out.println("Not Buddy Strings");
		}

	}


 static  boolean buddyStrings(String s1,String s2)
{
	int lengths1=s1.length();
	int lengths2=s2.length();
	if(lengths1!=lengths2||lengths1==0 && lengths2==0)
		return false;
	else if (s1.equals(s2))
	{
		HashSet<Character> set=new HashSet<>();
		for(char c : s1.toCharArray())
		{
			set.add(c);
		}
		return set.size()<lengths1;//false when set contains unique characters
		
	}
	
	
		int diffcount=0;
		ArrayList<Character> palindrome=new ArrayList<Character>();
		for(int i=0;i<s1.length();i++)
		{
			while(i<lengths1&&s1.charAt(i)==s2.charAt(i))
			{
				i++;
			}
			diffcount++;
			if(diffcount>2) return false;
			palindrome.add(s1.charAt(i));
			palindrome.add(s2.charAt(i));
		}
	      //  boolean value = palindrome.get(0) == palindrome.get(3) && palindrome.get(1) == palindrome.get(2); 
	     //   return value;    

			return (palindrome.get(0)==palindrome.get(3)) && (palindrome.get(1)==palindrome.get(2));
			
			
		
		
		
	
		

}
}
