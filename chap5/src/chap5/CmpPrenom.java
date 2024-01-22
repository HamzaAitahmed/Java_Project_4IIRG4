package chap5;

import java.util.Comparator;

public class CmpPrenom implements Comparator<Employe>{

	@Override
	public int compare(Employe o1, Employe o2) {
		// TODO Auto-generated method stub
		return o1.getPrenom().compareTo(o2.getPrenom());
	} }