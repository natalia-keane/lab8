package lab8;

import java.util.Comparator;

public abstract class CompareByPage implements Comparator<Book>{
	public int compare(Book book1, Book book2){
		Integer b1=book1.getPages();
		Integer b2=book2.getPages();
		if(b1>b2){ return 1;}
		else
			if(b1<b2){ return -1;}
			else{ return 0;}
	}
}
