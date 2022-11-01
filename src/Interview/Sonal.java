package Interview;

public class Sonal {

	public static void main(String[] args) {
		String nm= "i love u very much";
         String s[]=nm.split("");
         String ans="";
        for(int i=s.length-1;i>=0;i--)
        {
        	ans=ans+s[i]+"";
        }
	         System.out.println(ans);
			
		}
	}


