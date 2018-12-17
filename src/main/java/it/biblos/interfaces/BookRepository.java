package it.biblos.interfaces;

import it.biblos.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Integer, Book> {

}
