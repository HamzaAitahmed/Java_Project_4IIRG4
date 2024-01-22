package Pk___1;


import java.util.Comparator;

public class CmpSalaire implements Comparator<Employe> {

	@Override
	public int compare(Employe o1, Employe o2) {
		// TODO Auto-generated method stub
		return (int)(o1.getSalaire()-o2.getSalaire());
	}

}
