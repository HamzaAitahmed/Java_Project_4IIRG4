package S6;

import java.util.Comparator;

public class CmpNom implements Comparator<Employe>{

	@Override
	public int compare(Employe o1, Employe o2) {
		// TODO Auto-generated method stub
		return o1.getNom().compareTo(o2.getNom());
	}

}
