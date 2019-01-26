package it.biblos.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;

@Entity
@Table(name="autori")
@NamedNativeQuery(
		name="get_authors_dto", 
		query="SELECT a.IDAutore AS ID, a.nome AS nome, a.cognome AS cognome "
				+ "FROM autori a",
		resultSetMapping = "rs_get_authors_dto"
		)
@SqlResultSetMapping(
		name="rs_get_authors_dto", 
		classes = @ConstructorResult(
				targetClass = Author.class,
				columns = {
				@ColumnResult(name = "ID"),
				@ColumnResult(name = "nome"),
				@ColumnResult(name = "cognome")
				})
		)
public class Author
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IDAutore;
	@Column(nullable=false)
	private String nome;
	@Column(nullable=false)
	private String cognome;

	public Author() {}

	public Author(Long IDAutore, String nome, String cognome) {
		this.IDAutore = IDAutore;
		this.cognome = cognome;
		this.nome = nome;
	}

	public Long getIDAutore() {
		return IDAutore;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setIDAutore(Long IDAutore) {
		this.IDAutore = IDAutore;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public static Author getAuthorByID(Long ID, List<Author> authors)
	{
		Author auth = new Author();
		for(Author a : authors) {
			if(ID.compareTo(a.getIDAutore())==0) {
				auth = a;
				break;
			}
		}
		return auth;
	}
}
