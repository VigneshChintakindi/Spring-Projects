package demo.model.v1;

import java.util.List;
import java.util.ArrayList;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BooksService {
	
	@Autowired  
	BooksRepository booksRepository;  
	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Books> getAllBooks()   
	{  
	List<Books> books = new ArrayList<Books>();  
	booksRepository.findAll().forEach(books1 -> books.add(books1));  
	return books;
	}
	
	public Books getBooksById(int bookid) {
		return booksRepository.findById(bookid).get();  
	}

	public void delete(int bookid) {
		booksRepository.deleteById(bookid);  
		
	}

	public void saveOrUpdate(Books books) {
		booksRepository.save(books);  
		
	}
	public void update(Books books, int bookid)   
	{  
	booksRepository.save(books);  
	}
}
