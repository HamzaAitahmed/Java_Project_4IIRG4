package pk;

import java.sql.SQLException;

public class Personne {
 private String nom, prenom;
 private int age;


 


public Personne(String nom, String prenom, int age) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.age = age;
}





@Override
public String toString() {
	return this.getClass().getSimpleName() +  " nom=" + nom + ", prenom=" + prenom + ", age=" + age ;
}
 
 

 

	
	
	
}
