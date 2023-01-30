package demo.model.v1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired  
	BooksService booksService;  
	//creating a get mapping that retrieves all the books detail from the database   
	@GetMapping("/book")  
	private List<Books> getAllBooks()   
	{  
	return booksService.getAllBooks();  
	}  
	//creating a get mapping that retrieves the detail of a specific book  
	@GetMapping("/book/{id}")  
	private Books getBooks(@PathVariable("id") int id)   
	{  
	return booksService.getBooksById(id);  
	}  
	//creating a delete mapping that deletes a specified book  
	@DeleteMapping("/book/{id}")  
	private void deleteBook(@PathVariable("id") int id)   
	{  
	booksService.delete(id);  
	}  
	//creating post mapping that post the book detail in the database  
	@PostMapping("/books")  
	private int saveBook(@RequestBody Books books)   
	{  
	booksService.saveOrUpdate(books);  
	return books.getId();  
	}  
	//creating put mapping that updates the book detail   
	@PutMapping("/books")  
	private Books update(@RequestBody Books books)   
	{  
	booksService.saveOrUpdate(books);  
	return books;  
	}  
	}  

