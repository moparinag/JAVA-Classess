package ArrayPrograms;

public class ArrayCountOfWords {

	public static void main(String[] args) {
		String s="I Love My India. India is My Country";
		 s=s.replace('.', ' ');
		 s=s.replace("  "," ");
		System.out.println(s);
		CountWords(s);
	}
	private static void CountWords(String s) {
		String[] s1=s.split(" ");
		int count=0;
		int i=0;
		for(i=0;i<s1.length;i++)
		{
			count=1;
			for(int j=i+1;j<s1.length;j++)
			{
				if(s1[i].equals(s1[j]))
				{
					count++;
					s1[j]="";
				}
			}
			if(s1[i]!=""&&s1[i]!=" ")
			{
			System.out.println("Count of "+s1[i]+"="+count);
			}
			
		}
		
		
	}
}
