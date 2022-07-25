package ArrayPrograms;

public class Array5 {

	public static void main(String[] args) {
		Book[] BookArray=new Book[4];
		BookArray[0]=new Book("Mona",78.0987,"James");
		BookArray[1]=new Book("Taja",7854.987,"Gosling");
		BookArray[2]=new Book("Vijay",34.466,"vijaykumar");
		BookArray[3]=new Book("Laxmi",533.89,"Sarah");
		for(Book b:BookArray)
		{
		b.Display();
		}
	}

}
