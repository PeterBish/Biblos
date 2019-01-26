package it.biblos.metamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import it.biblos.model.Map;

@Generated(value="org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Map.class)
public abstract class Map_ {
	
	public static volatile SingularAttribute<Map, Long> IDMappa;
	public static volatile SingularAttribute<Map, String> corridoio;
	public static volatile SingularAttribute<Map, String> armadio;
	public static volatile SingularAttribute<Map, String> piano;
//	public static volatile PluralAttribute<Book, ArrayList<Book>, Map> books;
	
}