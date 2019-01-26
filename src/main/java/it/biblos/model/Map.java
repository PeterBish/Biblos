package it.biblos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="mappa")
public class Map {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IDMappa;
	@Column(name = "corridoio")
	private String corridoio;
	@Column(name = "armadio")
	private String armadio;
	@Column(name = "piano")
	private String piano;
//	@ManyToMany(mappedBy = "positions")
//	private ArrayList<Book> books;

	public Map(String corr){
		this.corridoio = corr;
	}
	
	public Map() {}
	
	public Map(Long IDMappa, String corridoio, String armadio, String piano)
	{
		this.IDMappa = IDMappa;
		this.corridoio = corridoio;
		this.armadio = armadio;
		this.piano = piano;
	}

	public Long getID_Mappa()
	{
		return IDMappa;
	}

	public String getCorridoio()
	{
		return corridoio ;
	}

	public String getArmadio()
	{
		return armadio;
	}

	public String getPiano()
	{
		return piano;
	}

	public void setIDMappa(Long IDMappa)
	{
		this.IDMappa = IDMappa;
	}

	public void setCorridoio(String corridoio)
	{
		this.corridoio = corridoio;
	}

	public void setArmadio(String armadio)
	{
		this.armadio = armadio;
	}

	public void setPiano(String piano)
	{
		this.piano = piano;
	}

}
