package exercices;


import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.comparing;
import java.util.OptionalInt;

import exercices.Member.Type;

import static exercices.Member.Type;
import static exercices.Member.members;
public class TestMember {

	public static void main(String[] args) {
		

		
		
		
		
		
		
		// 1.Sélectionner les membres ayant l’ « handicap » supérieur à 20 ;
		
		List<Member> l1 = members.stream()
				.filter(m->m.getHandicap()>20)
				.toList();
		l1.forEach(System.out::println);
		System.out.println();
		
		// 2.Sélectionner les noms (LastName) des « Members »  jouant dans TeamA ; 
		
		List<String> l2 = members.stream()
				.filter(m->m.getTeam()=="TeamA")
				.map(Member::getLastName)
				.toList();
		l2.forEach(System.out::println);
		System.out.println();
		
		// 3.Sélectionner les noms (LastName) des « Members» de « Gender » =F ;
		
		List<String> l3 = members.stream()
				.filter(m->m.getGender()=='F')
				.map(Member::getLastName).toList();
		l3.forEach(System.out::println);
		System.out.println();
		
		// 4.Trier les « Members» de type « Junior » en fonction de leur « handicap » ;
		
		List<Member> l4=members.stream()
				.filter(m->m.getType()==Type.Junior)
				.sorted(comparing(Member::getHandicap))
				.toList();
		l4.forEach(System.out::println);
		System.out.println();
		
	
		// 5.Tier les « Members» jouant dans « TeamA » en fonction de leur nom (lastName) ;
		
		List<Member> l5=members.stream()
				.filter(m->m.getTeam()=="TeamA")
				.sorted(comparing(Member::getLastName))
				.toList();
		l5.forEach(System.out::println);
		System.out.println();
		
		// 6.Sélectionner les types (type) des « Members » jouant dans l’équipe « TeamC » ;
		
		members.stream()
				.filter(m->m.getTeam()=="TeamC")
				.map(Member::getType).forEach(System.out::println);
		System.out.println();
		
		// 7.Sélectionner les noms (LastName) des « Members» de type « Senior » jouant dans « TeamB » ;	
		
		members.stream()
				.filter(m->m.getType()==Type.Senior && m.getTeam()=="TeamB")
				.map(Member::getLastName).forEach(System.out::println);
		System.out.println();
		
		// 8.Renvoyer le maximum des handicaps ;
		
		int maxH = members.stream()
				.mapToInt(Member::getHandicap)
				.max().getAsInt();
		System.out.println(maxH);
		
		// 9.Renvoyer le minimum des handicaps ;
		
		int minH = members.stream()
				.mapToInt(Member::getHandicap)
				.min().getAsInt();
		System.out.println(minH);
		
		// 10. Y'a t-il un membre jouant dans l'équipe TeamC et ayant un handicap >20 ;

		boolean b=members.stream()
				.anyMatch(m -> m.getTeam().equals("TeamC") && m.getHandicap() > 20 );
		System.out.println(maxH);
		
	}

}
