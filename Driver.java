import java.util.ArrayList;
import java.util.*;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import lab8.Book;
import lab8.CompareByPage;

public class Driver{

	public static void Main(String[] args){
		Scanner scan;
		scan= new Scanner(System.in);
		ArrayList<Book> bookList = new ArrayList<Book>();
		String response=null;

		String title, publisher;
		int pages, chapters;
		System.out.println("Do you want to enter the book information? Enter yes or no.");
		response= scan.nextLine();
		while (response.equalsIgnoreCase("Yes")){	
				Book books=createBookList();				
				bookList.add(books);
			
		}
		ArrayList<Book> books;
		Iterator<Book> iter = books.iterator();
    	{while(iter.hasNext()){
    		System.out.println(iter.next());
    	}
    		System.out.println("\n");
    		if(books.get(0).compareTo(books.get(1))<0){
    			System.out.println(books.get(0));
    			System.out.println(books.get(1));
    		}else{
    			System.out.println(books.get(1));
    			System.out.println(books.get(0));
    		}
    			System.out.println("\n");
		
		System.out.println("The books provided were: ");
		System.out.println(bookList);
		//print in order of publisher and title book list.
		
		
		Collections.sort(books, new Compared_ByPage());
        for(Book b: books){
            System.out.print(b);
        }
		private static Book createBookList(){
			System.out.println("Please enter book information. In the order of title, publisher, number of chapters and number of pages.");
			
	        System.out.println("Please enter the title of the book. ");
	        Scanner scan = null;
			String title = scan.nextLine();

	        System.out.println("Please enter the publisher of the book. ");
	        String publisher = scan.nextLine();

	        System.out.println("Please enter the number of chapters. ");
	        int chapters = scan.nextInt();

	        System.out.println("Please enter the number of pages ");
	        int pages = scan.nextInt();


	        return new Book(title, publisher, chapters, pages);
		}
}
