package it.biblos.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table (name="mappa")
public class Map {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ID_Mappa;
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
	
	public Map(Integer ID_Mappa, String corridoio, String armadio, String piano)
	{
		this.ID_Mappa = ID_Mappa;
		this.corridoio = corridoio;
		this.armadio = armadio;
		this.piano = piano;
	}

	public Integer getID_Mappa()
	{
		return ID_Mappa;
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

	public void setID_Mappa(Integer ID_Mappa)
	{
		this.ID_Mappa = ID_Mappa;
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
	
	public static Map getMapByID(Integer ID, List<Map> Maps)
	{
		Map found = new Map();
		for(Map m : Maps) {
			if(ID.compareTo(m.getID_Mappa())==0) {
				found = m;
				break;
			}
		}
		return found;
	}

}
