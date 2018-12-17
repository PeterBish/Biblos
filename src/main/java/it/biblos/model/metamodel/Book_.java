package it.biblos.model.metamodel;

import java.util.ArrayList;

import javax.annotation.Generated;
import javax.persistence.metamodel.PluralAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import it.biblos.model.Author;
import it.biblos.model.Book;
import it.biblos.model.Genre;
import it.biblos.model.Map;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Book.class)
public abstract class Book_
{
	public static volatile SingularAttribute<Book, Integer> ID;
	public static volatile SingularAttribute<Book, String> titolo;
	public static volatile SingularAttribute<Book, String> isbn;
	public static volatile SingularAttribute<Book, Genre> genre;
	public static volatile SingularAttribute<Book, Author> author;
	//X=; C=; E=;
	public static volatile PluralAttribute<Map, ArrayList<Map>, Book> position;
	//public static volatile SetAttribute<Book, List<Map>> positions;
}
