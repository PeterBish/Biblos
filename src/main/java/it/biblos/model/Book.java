package it.biblos.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.SqlResultSetMappings;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.ConstructorResult;

@Entity
@Table(name="libri")
@NamedNativeQueries({
	@NamedNativeQuery(
			name = "get_book_dto",
			query = "SELECT l FROM libri l",
			resultSetMapping = "rs_get_book_dto"
			),
//	@NamedNativeQuery(
//			name = "get_book_position_dto",
//			query = "SELECT p FROM posizioni p WHERE p.ID_Libro = :ID_Libro",
//			resultSetMapping = "rs_get_book_position_dto"
//			)
})
@SqlResultSetMappings({
	@SqlResultSetMapping(name="rs_get_book_dto", classes = @ConstructorResult(
		targetClass = Book.class,
			columns = {
				@ColumnResult(name = "IDLibro"),
				@ColumnResult(name = "titolo"),
				@ColumnResult(name = "isbn"),
				@ColumnResult(name = "IDAutore"),
				@ColumnResult(name = "IDGenere")
			})),
//	@SqlResultSetMapping(name = "rs_get_book_position_dto", classes = @ConstructorResult(
//			targetClass= Position.class,
//			columns = {
//					@ColumnResult(name = "ID_Posizione"),
//					@ColumnResult(name = "ID_Libro"),
//					@ColumnResult(name = "ID_Mappa")
//			}))
})
//@NamedQuery(
//		name = "count_position_by_title_corridor", 
//		query="Select count(m) From Book, Map m join m.ID_Libro b "
//)
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="IDLibro")
	private Long idLibro;

	@Column(name="titolo")
	private String titolo;

	@Column(name="isbn")
	private String isbn;

	@ManyToOne(targetEntity=Author.class)
	@JoinColumn(name="IDAutore", referencedColumnName = "IDAutore")
	private Author author;

	@ManyToOne(targetEntity=Genre.class)
	@JoinColumn(name="IDGenere", referencedColumnName = "IDGenere")
	private Genre genre;

	@ManyToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER,
			targetEntity=Map.class)
	@JoinTable(name="position", joinColumns = @JoinColumn(name = "IDLibro"))
	//(name = "IDLibro", inverseJoinColumns = @JoinColumn(name = "IDLibro")
	private List<Map> positions;
	
	@Transient()
	private Integer bookCount;

	public Book() {}
	
//	public Book(Book b, Genre genre, Author author) {
//		ID_Libro = b.getID();
//		this.titolo= b.getTitolo(); 
//		this.isbn = b.getIsbn();
//		this.author = author;
//		this.genre = genre;
//	}
	
	public Book(Book b, int bookCount) {
		this.idLibro = b.getID();
		this.titolo= b.getTitolo(); 
		this.isbn = b.getIsbn();
		this.author = b.getBookAutore();
		this.genre = b.getBookGenre();
		this.bookCount = bookCount;
	}

	public void setID(Long ID)
 	{
		this.idLibro = ID;
	}
	
	public void setTitolo (String titolo)
	{		
		this.titolo = titolo;
	}
	
	public void setIsbn(String isbn)
	{
		this.isbn = isbn;
	}

	public void setAuthor(Author author)
	{
		this.author = author;
	}
	
	public void setGenre(Genre genre)
	{
		this.genre = genre;
	}

	public List<Map> getPositions() {
		return positions;
	}

	public Long getID()
	{
		return this.idLibro;
	}

	public String getTitolo()
	{
		return titolo;
	}

	public String getIsbn()
	{
		return this.isbn;
	}

	public Author getBookAutore()
	{
		return this.author;
	}

	public Genre getBookGenre()
	{
		return this.genre;
	}

	public void setPositions(List<Map> positions) {
		this.positions = positions;
	}
}
