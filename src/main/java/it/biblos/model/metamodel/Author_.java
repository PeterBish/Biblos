package it.biblos.model.metamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import it.biblos.model.Author;


@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Author.class)
public abstract class Author_
{
	public static volatile SingularAttribute<Author, String> nome; 
	public static volatile SingularAttribute<Author, String> cognome; 
	public static volatile SingularAttribute<Author, Integer> ID_Autore; 
}
