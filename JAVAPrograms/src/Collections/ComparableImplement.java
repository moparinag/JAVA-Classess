package Collections;

public class ComparableImplement implements Comparable<ComparableImplement>{
	
	int Roll;
public ComparableImplement(int roll) {
	this.Roll=roll;
}
	public String toString()
	{
		String Roll=""+this.Roll;
		return Roll;
		
	}
	@Override
	public int compareTo(ComparableImplement c) {
		
		return c.Roll-this.Roll;
	}

}
