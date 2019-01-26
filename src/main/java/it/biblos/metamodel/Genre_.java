package it.biblos.metamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import it.biblos.model.Genre;

@Generated(value="org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Genre.class)
public abstract class Genre_ {
	
	public static volatile SingularAttribute<Genre, Long> IDGenere;
	public static volatile SingularAttribute<Genre, String> tipo;
	
}
