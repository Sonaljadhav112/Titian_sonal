package Interview;

public class DistributeUpperorLowerorNumber {

	public static void main(String[] args) {
	String s="Welecome In Automation TESTING Batch422123";
	String caps="";
	int upper = 0;
	String smal="";
	int lower=0;
	String no="";
	int number=0;
	
	for(int i=0;i<s.length();i++)
	{
		char x=s.charAt(i);
		if(x>=65 && x<=90) 
		{
			caps=caps+x;
			upper++;
		}
		else if(x>=97 && x<=122)
		{
			smal=smal+x;
		    lower++;
		}else if(x>=47 && x<=57)
		{
			no=no+x;
			number++;
		}
	}
	
	System.out.println(caps);
	System.out.println("UPPER"+upper);
	System.out.println(smal);
	System.out.println("Lower"+lower);
	System.out.println(no);
	System.out.println("Number"+number);
	}

}
