package it.biblos.model;

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
@Table(name="generi")
@NamedNativeQuery(
		name="get_genres_dto", 
		query="SELECT g.IDGenere AS ID, g.tipo AS tipo "
				+ "FROM generi g",
		resultSetMapping = "rs_get_genres_dto"
		)
@SqlResultSetMapping(
		name="rs_get_genres_dto", 
		classes = @ConstructorResult(
				targetClass = Genre.class,
				columns = {
				@ColumnResult(name = "ID"),
				@ColumnResult(name = "tipo"),
				})
		)
public class Genre {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="IDGenere")
	private Long IDGenere;
	@Column(name="tipo")
	private String tipo;
 	
	public Genre() {}

	public Genre(Long ID_Genere, String tipo)
	{
		this.IDGenere = ID_Genere;
		this.tipo = tipo;
	}
	
	public Long getIDGenere() {
		return this.IDGenere;
	}

	public String getTipo()
	{
		return this.tipo;
	}

	public void setIDGenere(Long IDGenere) {
		this.IDGenere = IDGenere;
	}

	public void setTipo(String tipo)
	{
		this.tipo = tipo;
	}

}