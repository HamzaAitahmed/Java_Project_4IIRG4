package PK1;


public class Employe implements Comparable<Employe> {
	String nom , id  ;

	public Employe(String nom, String id) {
		super();
		this.nom = nom;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employe [nom=" + nom + ", id=" + id + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employe other = (Employe) obj;
		return this.id==other.id;
	}

	@Override
	protected Employe clone(){
		// TODO Auto-generated method stub
		try {
			return (Employe)super.clone();
			}
		catch(CloneNotSupportedException e){
			return null;
		}
	}
	
	@Override
	public int compareTo(Employe o) {
		// TODO Auto-generated method stub
		return this.id.compareTo(o.id);
	}
	
	
}
