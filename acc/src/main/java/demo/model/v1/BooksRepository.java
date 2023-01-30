package demo.model.v1;
import org.springframework.data.repository.CrudRepository;
import demo.model.v1.Books;

public interface BooksRepository extends CrudRepository<Books, Integer> {

}
