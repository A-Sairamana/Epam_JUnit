package junit_ht;

public class TestString {
	
	public String checkFirst2Chars(String string) {
		String result = null;
		if(string=="" || string=="A")
		{
			result="";
		}
		
		else if(string.length()==1 && string!="A")
		{
			result=string;
		}
		
		else
		{	
			char firstChar=string.charAt(0); 
			char secondChar=string.charAt(1);
			if(firstChar=='A' && secondChar=='A')
			{
				result=string.substring(2);
			}
			else
			{
				if(firstChar=='A')
				{
					result=string.substring(1);
				}
				if(secondChar=='A')
				{
					result=string.charAt(0)+string.substring(2);
				}
			}
			
		}
		return result;
	}

}
