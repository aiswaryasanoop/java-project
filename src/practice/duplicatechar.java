package practice;

public class duplicatechar {

	public static void main(String[] args) {
		
		String s="hackerearth";
	
		char[]s1=s.toCharArray();
		int n=s1.length;
		//int count;
		for(int i=0;i<=n;i++)
		{
			//count=1;
        for(int j=i+1;j<=n;j++)
        {
        	if(s1[i]==s1[j]) {
        	//count++;
        	System.out.println(s1[j]);
        	
        	}
        	
        }
        
	}

	}
}
