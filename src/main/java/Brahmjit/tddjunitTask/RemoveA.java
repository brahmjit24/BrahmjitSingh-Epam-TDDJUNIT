package Brahmjit.tddjunitTask;

public class RemoveA {
	public String remove(String s)
	{
		String result=s;
		int length=s.length();
		if(length>2) {
		if(s.charAt(0)=='A'&&s.charAt(1)=='A')
		result=s.substring(2);
		else if(s.charAt(0)=='A'&&s.charAt(1)!='A')
		result=s.substring(1);
		else if(s.charAt(0)!='A'&&s.charAt(1)=='A')
		result=s.charAt(0)+s.substring(2);
		}
		else {
			if(length==1)
			{	if(s.charAt(0)=='A')
					result="";
			}
			else if(length==2)
			{
				    if(s.charAt(0)=='A'&&s.charAt(1)=='A')
					result="";
					else if(s.charAt(0)=='A'&&s.charAt(1)!='A')
					result=s.charAt(1)+"";
					else if(s.charAt(0)!='A'&&s.charAt(1)=='A')
					result=s.charAt(0)+"";
			}
		}
		return result;
	}
}
