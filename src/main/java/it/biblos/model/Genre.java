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
@Table(name="generi")
@NamedNativeQuery(
		name="get_genres_dto", 
		query="SELECT g.ID_Genere AS ID, g.tipo AS tipo "
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
	@Column(name="ID_Genere")
	private Integer ID_Genere;
	@Column(name="tipo")
	private String tipo;
 	
	public Genre() {}

	public Genre(Integer ID_Genere, String tipo)
	{
		this.ID_Genere = ID_Genere;
		this.tipo = tipo;
	}
	
	public Integer getID_Genere() {
		return this.ID_Genere;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setID_Genere(Integer ID_Genere) {
		this.ID_Genere = ID_Genere;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
		String[] a = new String [11];
	}
	
	public static Genre getGenreByID(Integer ID, List<Genre> genres)
	{
		Genre genre = new Genre();
		for(Genre g : genres) {
			if(ID.compareTo(g.getID_Genere())==0) {
				genre = g;
				break;
			}
		}
		return genre;
	}
}